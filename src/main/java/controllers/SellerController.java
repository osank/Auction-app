package controllers;

import SellerPayload.*;

public interface SellerController {

    //PUT
    CreateAuctionResponse createAuction(CreateAuctionRequest createAuctionRequest);

    //POST
    RevokeAuctionResponse revokeAuction(RevokeAuctionRequest revokeAuctionRequest);

    //GET
    AuctionStatusResponse getStatusofLiveAuction(AuctionStatusRequest auctionStatusRequest);
}
