package dao;

import models.Auction;
import models.Bid;

import java.util.*;
import java.util.stream.Collectors;

public class BidDao {

    //Mimics database for bids. consists of bids per auction.
    HashMap<Integer, Bid> bids;

    public BidDao(){
        if(bids == null)
            bids = new HashMap<>();
    }

    public HashMap<Integer, Bid> getBids(){
        if(bids != null)
            return bids;
        bids = new HashMap<>();
        return bids;
    }

    public List<Integer> getBidsforBuyer(int buyerId){
        return bids.values().stream().filter(bid -> bid.getBuyerId() == buyerId).map(bid -> bid.getAuctionId()).collect(Collectors.toList());
    }




}
