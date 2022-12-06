package controllers;

import Seller.*;
import models.Auction;

import java.util.List;

public interface SellerController {

    //PUT
    CreateAuctionResponse createAuction(CreateAuctionRequest createAuctionRequest);

    //POST
    RevokeAuctionResponse revokeAuction(RevokeAuctionRequest revokeAuctionRequest);

    //GET
    AuctionStatusResponse getStatusofLiveAuction(AuctionStatusRequest auctionStatusRequest);
}
