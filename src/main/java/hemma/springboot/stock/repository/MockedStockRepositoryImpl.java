package hemma.springboot.stock.repository;

import hemma.springboot.stock.model.Stock;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

@Repository
public class MockedStockRepositoryImpl implements StockRepository {
    @Override
    public Collection<Stock> stocks() {
        return Arrays.asList(
                new Stock(1L, "VMWare", "VMW", BigDecimal.valueOf(56.05)),
                new Stock(2L, "AT&T", "T", BigDecimal.valueOf(38.74)),
                new Stock(3L, "Facebook", "FB", BigDecimal.valueOf(118.25))
        );
    }

    @Override
    public Stock stock(Long stockId) {
        return new Stock(1L, "VMWare", "VMW", BigDecimal.valueOf(56.05));
    }
}
