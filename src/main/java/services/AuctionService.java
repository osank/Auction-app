package services;

import Buyer.AuctionHistoryRequest;
import Buyer.AuctionHistoryResponse;
import Seller.*;
import dao.AuctionDao;
import dao.BidDao;
import models.Auction;

import java.util.List;
import java.util.Random;

public class AuctionService {

    AuctionDao auctionDao;
    BidDao bidsDao;

    public AuctionService(){
        this.auctionDao = new AuctionDao();
        this.bidsDao = new BidDao();
    }
    public CreateAuctionResponse createAuction(CreateAuctionRequest createAuctionRequest){

        //validateParams(itemId, basePricem, startTime,sellerId);
        CreateAuctionResponse response = validateParams(createAuctionRequest);

        if(response !=null)
            return response;

        Integer auctionId = generateAuctionId();
        auctionDao.createAuction(auctionId, createAuctionRequest.getItemId(), createAuctionRequest.getBasePrice(),
                createAuctionRequest.getStartTime(),createAuctionRequest.getSellerId());

        return new CreateAuctionResponse(auctionId);

    }

    private CreateAuctionResponse validateParams(CreateAuctionRequest createAuctionRequest){

        if(createAuctionRequest.getItemId() == null || createAuctionRequest.getSellerId() == null ||
                createAuctionRequest.getStartTime() ==null || createAuctionRequest.getBasePrice() == null){
            String error = "Invalid Parameters";
            return new CreateAuctionResponse(422, error);
        }
        return null;
        //TODO: Add more validations
    }

    public RevokeAuctionResponse revokeAuction(RevokeAuctionRequest revokeAuctionRequest){
        //TODO:validate sellerId and permissions
        return new RevokeAuctionResponse(auctionDao.revokeAuction(revokeAuctionRequest.getAuctionId()));

    }

    public List<Auction> getLiveAuctions(){
        return auctionDao.getLiveAuctions();
    }
    public AuctionStatusResponse getLiveAuctions(AuctionStatusRequest auctionStatusRequest){
       return new AuctionStatusResponse(auctionDao.getLiveAuctions(auctionStatusRequest.getSellerId()));
    }

    public boolean bidonAuction(int buyerId, int auctionId, double price){
       Auction auction  =  auctionDao.getAuction(auctionId);
       if(auction.getLastBidOwner() == buyerId ){
           //TODO:throw exception
       }

       if(auction.getLastBid()*(double)1.02 > price ){
            return false;
            //TODO: wrap it inside error message
       }
       auction.setLastBidOwner(buyerId);
       auction.setLastBid(price);
       shouldExtendAuction(auction);

       auctionDao.saveorUpdateAuction(auction);
        return true;
    }

    public AuctionHistoryResponse getAuctionHistory(AuctionHistoryRequest auctionHistoryRequest){
        int buyerId = auctionHistoryRequest.getBuyerId();
        List<Integer> auctionIds = bidsDao.getBidsforBuyer(buyerId);
        List<Auction> auctions = auctionDao.getAuctionsforIds(auctionIds);
        AuctionHistoryResponse response = new AuctionHistoryResponse(auctions);
        return response;
    }

    private void shouldExtendAuction(Auction auction){
        if(auction.getEndTime() - System.currentTimeMillis() < 300000 && auction.getExtendedCount() < 100) {
            auction.setEndTime(auction.getEndTime() + 600000);
            auction.setExtendedCount(auction.getExtendedCount()+1);
        }
    }

    private Integer generateAuctionId(){
        //this should actually pick from already generated random sequence pool or generate increasing sequence number
        Random r  = new Random();
        return r.nextInt();
    }



}
