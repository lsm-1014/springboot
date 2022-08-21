package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04TestApplicationTests {

    @Value("${test.port}")
    private String msg;

    @Test
    void testContextLoads() {
        System.out.println(msg);
    }

}
