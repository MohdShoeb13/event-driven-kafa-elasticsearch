package com.microservices.demo.twitter.to.kafka.service;

import com.microservices.demo.twitter.to.kafka.service.config.TwitterToKafkaServicesConfigData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TwitterToKafkaService implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(TwitterToKafkaService.class);

    private final TwitterToKafkaServicesConfigData twitterToKafkaServicesConfigData;

    public TwitterToKafkaService(TwitterToKafkaServicesConfigData twitterToKafkaServicesConfigData) {
        this.twitterToKafkaServicesConfigData = twitterToKafkaServicesConfigData;
    }

    public static void main(String[] args) {
        SpringApplication.run(TwitterToKafkaService.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
      LOGGER.info("App Starts....");
      LOGGER.info(Arrays.toString(twitterToKafkaServicesConfigData.getTwitterKeywords().toArray(new String[0])));
    }
}
