package Seller;

public class RevokeAuctionResponse {

    boolean success;
    int responseCode;
    String errorMessage;

    public RevokeAuctionResponse(boolean success){
        success = true;
        responseCode = 200;
    }

    public RevokeAuctionResponse(int responseCode, String errorMessage){
        this.responseCode = responseCode;
        this.errorMessage = errorMessage;

    }
}
