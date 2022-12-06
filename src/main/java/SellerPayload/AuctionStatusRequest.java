package SellerPayload;

public class AuctionStatusRequest {

    int sellerId;

    public int getSellerId() {
        return sellerId;
    }

    public AuctionStatusRequest setSellerId(int sellerId) {
        this.sellerId = sellerId;
        return this;
    }
}
