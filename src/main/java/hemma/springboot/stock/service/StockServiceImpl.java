package hemma.springboot.stock.service;

import com.google.common.collect.ImmutableList;
import hemma.springboot.stock.model.Stock;
import hemma.springboot.stock.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    public StockRepository stockRepository;

    public Collection<Stock> stocks() {
        return ImmutableList.copyOf(stockRepository.findAll());
    }

    public Stock stock(Long stockId) {
        return stockRepository.findOne(stockId);
    }
}
