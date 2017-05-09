package hemma.springboot.stock.model;

import java.math.BigDecimal;

public class Stock {
    private Long id;
    private String companyName;
    private String symbol;
    private BigDecimal price;

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
