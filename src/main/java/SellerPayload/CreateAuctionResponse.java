package SellerPayload;

public class CreateAuctionResponse {

    int auctionId;
    int responseCode;
    String errorMessage;

    public CreateAuctionResponse(int auctionId){
        this.auctionId = auctionId;
        this.responseCode = 200;
    }

    public CreateAuctionResponse(int responseCode, String errorMessage){
        this.responseCode = responseCode;
        this.errorMessage = errorMessage;

    }
}
