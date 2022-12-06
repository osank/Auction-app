package SellerPayload;

import models.Auction;

import java.util.List;

public class AuctionStatusResponse {

    List<Auction> auctions;
    int responseCode;
    String errorMessage;

    public AuctionStatusResponse( List<Auction> auctions){
        this.auctions = auctions;
        this.responseCode = 200;
    }

    public AuctionStatusResponse(int responseCode, String errorMessage){
        this.responseCode = responseCode;
        this.errorMessage = errorMessage;

    }
}
