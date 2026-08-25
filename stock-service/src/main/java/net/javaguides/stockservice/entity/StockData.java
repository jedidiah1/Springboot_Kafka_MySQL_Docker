package net.javaguides.stockservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
//import lombok.Getter;
//import lombok.Setter;

@Entity
@Table(name = "stock_data_entry")
//@Getter
//@Setter
public class StockData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String stockEntryData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStockEntryData() {
        return stockEntryData;
    }

    public void setStockEntryData(String stockEntryData) {
        this.stockEntryData = stockEntryData;
    }

    

}
