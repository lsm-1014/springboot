package com.itheima.service;

import com.itheima.dao.Book;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

public interface BookService {
    Boolean save(Book book);
    Book getById(Integer id);
    Boolean update(Book book);
    Boolean delete(Integer id);
    List<Book> getAll();
}
