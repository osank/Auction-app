package Buyer;

import models.Auction;

import java.util.List;

public class AuctionHistoryResponse {

    List<Auction> auctionList;
    int responseCode;
    String errorMessage;

    public AuctionHistoryResponse(List<Auction> auctionList){
        this.auctionList =auctionList;
        this.responseCode = 200;
    }

    AuctionHistoryResponse(int responseCode, String errorMessage){
       this.responseCode = responseCode;
       this.errorMessage = errorMessage;
    }
}
