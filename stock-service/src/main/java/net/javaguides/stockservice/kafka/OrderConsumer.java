package net.javaguides.stockservice.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import net.javaguides.basedomains.dto.OrderEvent;
import net.javaguides.stockservice.entity.StockData;
import net.javaguides.stockservice.repository.StockDataRepository;

@Service
public class OrderConsumer {

    private static final Logger LOGGER =  LoggerFactory.getLogger(OrderConsumer.class);

    private StockDataRepository dataRepository;

    public OrderConsumer(StockDataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @KafkaListener(topics = "${kafka.topic.order}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent event){
        LOGGER.info(String.format("Order Event Received In Stock Service => %s", event.toString()));

        // Save to the database.
          StockData stockData = new StockData();
          stockData.setStockEntryData(event.toString());

         dataRepository.save(stockData);
    }

}
