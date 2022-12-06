package models;

public class Bid {

    int buyerId;
    int auctionId;
    int timeStamp;
    double price;
    boolean isWiningBid;

    public int getBuyerId() {
        return buyerId;
    }

    public Bid setBuyerId(int buyerId) {
        this.buyerId = buyerId;
        return this;
    }

    public int getAuctionId() {
        return auctionId;
    }

    public Bid setAuctionId(int auctionId) {
        this.auctionId = auctionId;
        return this;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public Bid setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Bid setPrice(double price) {
        this.price = price;
        return this;
    }

    public boolean isWiningBid() {
        return isWiningBid;
    }

    public Bid setWiningBid(boolean winingBid) {
        isWiningBid = winingBid;
        return this;
    }
}
