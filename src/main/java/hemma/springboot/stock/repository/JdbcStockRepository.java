package hemma.springboot.stock.repository;

import hemma.springboot.stock.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

@Repository
public class JdbcStockRepository implements StockRepository {
    private static final String GET_STOCK_SQL = "SELECT id, companyName, symbol, price from stock where stock_id = ?";
    private static final String GET_STOCKS_SQL = "SELECT id, companyName, symbol, price from stock";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcStockRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Collection<Stock> stocks() {
        return jdbcTemplate.query(GET_STOCKS_SQL,
                new Object[]{},
                (resultSet, i) -> rowToStock(resultSet));
    }

    @Override
    public Stock stock(Long stockId) {
        return jdbcTemplate.queryForObject(GET_STOCK_SQL,
                new Object[]{stockId},
                (resultSet, i) -> rowToStock(resultSet));
    }

    private Stock rowToStock(ResultSet resultSet) throws SQLException {
        return new Stock(
                resultSet.getLong("id"),
                resultSet.getString("companyName"),
                resultSet.getString("symbol"),
                resultSet.getBigDecimal("price"));
    }
}