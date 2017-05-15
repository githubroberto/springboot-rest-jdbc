package hemma.springboot.stock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String companyName;
    private String symbol;
    private BigDecimal price;

    public Stock() {}

    public Stock(Long id, String companyName, String symbol, BigDecimal price) {
        this.id = id;
        this.companyName = companyName;
        this.symbol = symbol;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
