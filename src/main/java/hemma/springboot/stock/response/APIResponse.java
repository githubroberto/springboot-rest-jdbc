package hemma.springboot.stock.response;

public class APIResponse<T> {
    private final int responseCode;
    private final String responseMessage;
    private final T responseBody;

    public APIResponse(int responseCode, String responseMessage, T responseBody) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.responseBody = responseBody;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public T getResponseBody() {
        return responseBody;
    }
}
