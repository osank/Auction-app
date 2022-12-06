package SellerPayload;

public class RevokeAuctionRequest {

    int auctionId;

    int sellerId;

    public int getAuctionId() {
        return auctionId;
    }

    public RevokeAuctionRequest setAuctionId(int auctionId) {
        this.auctionId = auctionId;
        return this;
    }

    public int getSellerId() {
        return sellerId;
    }

    public RevokeAuctionRequest setSellerId(int sellerId) {
        this.sellerId = sellerId;
        return this;
    }
}
