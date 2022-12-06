package controllers;

import Seller.*;
import services.AuctionService;


public class SellerControllerImpl implements  SellerController {

    private AuctionService auctionService;

    @Override
    public CreateAuctionResponse createAuction(CreateAuctionRequest createAuctionRequest){
        return auctionService.createAuction(createAuctionRequest);
    }

    @Override
    public RevokeAuctionResponse revokeAuction(RevokeAuctionRequest revokeAuctionRequest){
        return auctionService.revokeAuction(revokeAuctionRequest);
    }

    @Override
    public AuctionStatusResponse getStatusofLiveAuction(AuctionStatusRequest auctionStatusRequest){
        return  auctionService.getLiveAuctions(auctionStatusRequest);
    }


}
