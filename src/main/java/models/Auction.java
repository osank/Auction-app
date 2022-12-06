package models;

public class Auction {

    private int auctionId;
    private long startTime;
    private long endTime;
    private int itemId;
    private int sellerId;
    private double lastBid;
    private int lastBidOwner;
    private int winnerId;
    private boolean isLive;
    private int extendedCount;
    private double basePrice;

    public Auction(int itemId, long startTime, double basePrice, int sellerId){
        this.basePrice = basePrice;
        this.itemId = itemId;
        this.startTime = startTime;
        this.endTime = this.startTime + 3600000L;
        this.isLive = false;
        this.isValid = true;
    }

    public int getAuctionId() {
        return auctionId;
    }

    public Auction setAuctionId(int auctionId) {
        this.auctionId = auctionId;
        return this;
    }

    public boolean isLive() {
        return isLive;
    }

    public Auction setLive(boolean live) {
        isLive = live;
        return this;
    }

    public boolean isValid() {
        return isValid;
    }

    public Auction setValid(boolean valid) {
        isValid = valid;
        return this;
    }

    boolean isValid; //soft delete
    public long getStartTime() {
        return startTime;
    }

    public Auction setStartTime(long startTime) {
        this.startTime = startTime;
        return this;
    }

    public long getEndTime() {
        return endTime;
    }

    public Auction setEndTime(long endTime) {
        this.endTime = endTime;
        return this;
    }

    public int getItemId() {
        return itemId;
    }

    public Auction setItemId(int itemId) {
        this.itemId = itemId;
        return this;
    }

    public int getSellerId() {
        return sellerId;
    }

    public Auction setSellerId(int sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    public double getLastBid() {
        return lastBid;
    }

    public Auction setLastBid(double lastBid) {
        this.lastBid = lastBid;
        return this;
    }

    public int getWinnerId() {
        return winnerId;
    }

    public Auction setWinnerId(int winnerId) {
        this.winnerId = winnerId;
        return this;
    }

    public int getExtendedCount() {
        return extendedCount;
    }

    public Auction setExtendedCount(int extendedCount) {
        this.extendedCount = extendedCount;
        return this;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Auction setBasePrice(double basePrice) {
        this.basePrice = basePrice;
        return this;
    }

    public int getLastBidOwner() {
        return lastBidOwner;
    }

    public Auction setLastBidOwner(int lastBidOwner) {
        this.lastBidOwner = lastBidOwner;
        return this;
    }


}
