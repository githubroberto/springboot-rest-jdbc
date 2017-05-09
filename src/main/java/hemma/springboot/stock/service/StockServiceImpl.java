package hemma.springboot.stock.service;

import hemma.springboot.stock.model.Stock;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

@Service
public class StockServiceImpl implements StockService {

    public Collection<Stock> stocks() {
        return Arrays.asList(
                new Stock(1L, "VMWare", "VMW", BigDecimal.valueOf(56.05)),
                new Stock(2L, "AT&T", "T", BigDecimal.valueOf(38.74)),
                new Stock(3L, "Facebook", "FB", BigDecimal.valueOf(118.25))
                );
    }

    public Stock stock(Long stockId) {
        return new Stock(1L, "VMWare", "VMW", BigDecimal.valueOf(56.05));
    }
}
