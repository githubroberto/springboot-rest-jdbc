package hemma.springboot.stock.response;

import hemma.springboot.stock.model.Stock;

public class StockResponse {
    private final Stock stock;

    public StockResponse(Stock stock) {
        this.stock = stock;
    }

    public Stock getStock() {
        return stock;
    }
}
