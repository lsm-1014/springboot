package com.itheima.springboot_01_junit.dao.impl;

import com.itheima.springboot_01_junit.dao.BookDao;
import org.springframework.stereotype.Component;

@Component
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao is running...");
    }
}
