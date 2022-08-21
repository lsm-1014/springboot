package com.itheima.service.impl;

import com.itheima.daman.Book;
import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return bookDao.insert(book)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.deleteById(id)>0;
    }

}