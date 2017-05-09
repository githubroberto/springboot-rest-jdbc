package hemma.springboot.stock.response;

import hemma.springboot.stock.model.Stock;

import java.util.Collection;

public class StocksResponse {
    private final Collection<Stock> stocks;

    public StocksResponse(Collection<Stock> stocks) {
        this.stocks = stocks;
    }

    public Collection<Stock> getStocks() {
        return stocks;
    }
}
