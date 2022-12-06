package Seller;

public class CreateAuctionRequest {

    Integer itemId;
    Double basePrice;
    Integer startTime;
    Integer sellerId;

    public Integer getItemId() {
        return itemId;
    }

    public CreateAuctionRequest setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public CreateAuctionRequest setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
        return this;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public CreateAuctionRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public CreateAuctionRequest setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
        return this;
    }
}
