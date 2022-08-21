package com.itheima.dao;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.doman.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTest {

    @Autowired
    private BookDao bookDao;


    @Test
    void testGetById(){
        bookDao.selectById(1);
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.insert(book);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(17);
        book.setType("测试数据qwe");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.updateById(book);
    }

    @Test
    void testDelete(){
        bookDao.deleteById(17);
    }

    @Test
    void testGetAll(){
        bookDao.selectList(null);
    }

    @Test
    void testGetPage(){
        IPage page = new Page(1,5);
        bookDao.selectPage(page,null);
    }

    @Test
    void testGetBy(){
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name","spring");
        bookDao.selectList(qw);

    }

    @Test
    void testGetBy1(){
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(Book::getName,"spring");
        bookDao.selectList(lqw);

    }




}