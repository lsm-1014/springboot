package com.itheima;


import com.itheima.daman.Book;
import com.itheima.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("springboot123");
        book.setName("springboot");
        book.setDescription("springboot");
        bookService.save(book);
    }

    @Test
    void testDelete(){
        bookService.delete(28);
    }
}
