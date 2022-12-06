package controllers;

import BuyerPayload.AuctionHistoryRequest;
import BuyerPayload.AuctionHistoryResponse;
import models.Auction;

import java.util.List;

public interface BuyerController {
    //GET
    List<Auction> getStatusofLiveAuction(); //TODO : WRAP in object

    //POST
    boolean bidonAuction(int buyerId, int auctionId, double price); // //TODO : WRAP in object

    //GET
    AuctionHistoryResponse getAuctionHistory(AuctionHistoryRequest auctionHistoryRequest);
}
