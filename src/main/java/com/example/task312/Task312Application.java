package com.example.task312;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = LiquibaseAutoConfiguration.class)
public class Task312Application {

    public static void main(String[] args) {
        SpringApplication.run(Task312Application.class, args);
    }

}
