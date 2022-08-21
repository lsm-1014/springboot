package com.itheima.service;

import com.itheima.daman.Book;

public interface BookService {
    public boolean save(Book book);

    public boolean delete(Integer id);
}
