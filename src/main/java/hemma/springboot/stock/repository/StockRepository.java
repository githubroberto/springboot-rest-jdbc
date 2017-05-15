package hemma.springboot.stock.repository;

import hemma.springboot.stock.model.Stock;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<Stock, Long>{
}
