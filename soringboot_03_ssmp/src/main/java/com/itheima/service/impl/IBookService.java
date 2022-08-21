package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.doman.Book;

public interface IBookService extends IService<Book> {
    Boolean modify(Book book);

    Boolean delete(Integer id);

    IPage<Book> getPage(int currentPage,int pageSize);


    IPage<Book> getPage(int currentPage, int pageSize, Book book);

}
