package com.itheima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${country}")
    private String country;

    @Value("${user1.name}")
    private String name1;

    @Value("${likes[1]}")
    private String likes;

    @Value("${tempDir}")
    private String tempDir1;

    @Autowired
    private Environment env;

    @Autowired
    private MyDataSource source;

    @GetMapping
    public String getById(){
        System.out.println("springboot is running...1");
        System.out.println(country);
        System.out.println(name1);
        System.out.println(likes);
        System.out.println(tempDir1);

        System.out.println("----------");
        System.out.println(env.getProperty("user1.name"));
        System.out.println(env.getProperty("country"));
        System.out.println(source);
        return "springboot is running....1";
    }

}
