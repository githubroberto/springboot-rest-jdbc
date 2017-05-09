package hemma.springboot.stock.config;

import hemma.springboot.stock.controller.StockController;
import hemma.springboot.stock.service.StockService;
import hemma.springboot.stock.service.StockServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MockedConfiguration {

    @Bean
    public StockController stockController() {
        return new StockController(stockService());
    }

    @Bean
    public StockService stockService() {
        return new StockServiceImpl();
    }
}
