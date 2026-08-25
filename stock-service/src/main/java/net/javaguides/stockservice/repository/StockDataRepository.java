package net.javaguides.stockservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.stockservice.entity.StockData;

public interface StockDataRepository extends JpaRepository<StockData, Long> {

}
