package com.itheima;

import com.itheima.service.SendService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot08MailApplicationTests {

    @Autowired
    private SendService sendService;


    @Test
    void contextLoads() {
        sendService.sendMail();
    }

}
