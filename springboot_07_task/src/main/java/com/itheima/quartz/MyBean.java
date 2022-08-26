package com.itheima.quartz;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    @Scheduled(cron = "0/5 * * * * ?")
    public void print(){
        System.out.println("run ....");
    }
}
