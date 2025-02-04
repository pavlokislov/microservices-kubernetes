package org.pkislov.recipientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class RecipientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecipientServiceApplication.class, args);
    }

}
