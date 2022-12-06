package BuyerPayload;

public class AuctionHistoryRequest {

    int buyerId;

    public int getBuyerId() {
        return buyerId;
    }

    public AuctionHistoryRequest setBuyerId(int buyerId) {
        this.buyerId = buyerId;
        return this;
    }
}
