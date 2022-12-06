package dao;

import models.Auction;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class AuctionDao {

    //using map here to store auctions - different dao implementations can have db/cache etc
    //just add new dao classes to insert different storage
    private static HashMap<Integer , Auction> auctions;

   public AuctionDao(){
       if(auctions == null)
           auctions = new HashMap<>();
    }

    public HashMap<Integer , Auction> getAuctions(){
       if(auctions != null)
           return auctions;
       auctions = new HashMap<>();
       return auctions;
    }


    public Boolean createAuction(int auctionId , int itemId , double basePrice , long startTime, int sellerId){
        Auction auction = new Auction (auctionId, itemId, basePrice, sellerId);
        auctions.put(auctionId, auction);
        return true;
    }

    public Boolean revokeAuction(int auctionId){
       auctions.get(auctionId).setLive(false);
       return true;
    }

    public List<Auction> getLiveAuctions(){
       return auctions.values().stream().filter(auction -> auction.isLive() == true).collect(Collectors.toList());
    }

    public List<Auction> getLiveAuctions(int sellerId){
        return auctions.values().stream().filter(auction -> (auction.isLive() == true && auction.getSellerId() == sellerId)).collect(Collectors.toList());
    }

    public Auction getAuction(int auctionId){
       return auctions.get(auctionId);
    }
    public void saveorUpdateAuction(Auction auction){
       auctions.put(auction.getAuctionId(), auction);
    }

    public List<Auction> getAuctionsforIds(List<Integer> auctionIds){
        return auctions.values().stream().filter(auction -> auctionIds.contains(auction.getAuctionId())).collect(Collectors.toList());
    }
}
