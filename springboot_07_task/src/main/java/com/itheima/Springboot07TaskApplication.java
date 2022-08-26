package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Springboot07TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot07TaskApplication.class, args);
    }

}
