package net.javaguides.orderservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    // Get the topic name from application.properties file
    @Value("${kafka.topic.order}")
    private String topicName;

    // Spring bean for kafka topic
    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(topicName)
        .build();

    }
}
