package hemma.springboot.stock.controller;

import hemma.springboot.stock.model.Stock;
import hemma.springboot.stock.response.APIResponse;
import hemma.springboot.stock.response.ResponseMessage;
import hemma.springboot.stock.response.StockResponse;
import hemma.springboot.stock.response.StocksResponse;
import hemma.springboot.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/stocks")
public class StockController {

    private final StockService stockService;

    @Autowired
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public APIResponse<StocksResponse> stocks() {
        Collection<Stock> stocks = stockService.stocks();
        StocksResponse stocksResponse = new StocksResponse(stocks);
        return new APIResponse<>(HttpStatus.OK.value(), ResponseMessage.successful.getValue(), stocksResponse);
    }

    @RequestMapping(value = {"/{stockId"}, method = RequestMethod.GET)
    public APIResponse<StockResponse> stock(@PathVariable("stockId") Long stockId) {
        Stock stock = stockService.stock(stockId);
        StockResponse stockResponse = new StockResponse(stock);
        return new APIResponse<>(HttpStatus.OK.value(), ResponseMessage.successful.getValue(), stockResponse);
    }
}
