package controllers;

import Buyer.AuctionHistoryRequest;
import Buyer.AuctionHistoryResponse;
import models.Auction;
import services.AuctionService;

import java.util.List;

public class BuyerControllerImpl implements BuyerController{

    private AuctionService auctionService;

    @Override
    public List<Auction> getStatusofLiveAuction(){
        return  auctionService.getLiveAuctions();
    }

    @Override
    public boolean bidonAuction(int buyerId, int auctionId, double price){
        return auctionService.bidonAuction(buyerId, auctionId, price);
    }

    @Override
    public AuctionHistoryResponse getAuctionHistory(AuctionHistoryRequest auctionHistoryRequest){
        return auctionService.getAuctionHistory(auctionHistoryRequest);
    }
}
