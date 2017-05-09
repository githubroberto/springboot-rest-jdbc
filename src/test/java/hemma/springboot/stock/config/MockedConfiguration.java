package hemma.springboot.stock.config;

import hemma.springboot.stock.controller.StockController;
import hemma.springboot.stock.repository.MockedStockRepositoryImpl;
import hemma.springboot.stock.repository.StockRepository;
import hemma.springboot.stock.service.StockService;
import hemma.springboot.stock.service.StockServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MockedConfiguration {

    @Bean
    public StockRepository stockRepository() {
        return new MockedStockRepositoryImpl();
    }

    @Bean
    public StockController stockController() {
        return new StockController(stockService());
    }

    @Bean
    public StockService stockService() {
        return new StockServiceImpl(stockRepository());
    }
}
