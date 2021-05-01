package com.jh.test;

import com.jh.pojo.Book;
import com.jh.service.BookService;
import com.jh.service.impl.BookServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BookServiceTest {

    private BookService bookService = new BookServiceImpl();

    @Test
    public void addBook() {
        bookService.addBook(new Book(null,"国哥在手，天下我有","1125",new BigDecimal(1000000),1000000,0,null));
    }

    @Test
    public void deleteBookById() {
        bookService.deleteBookById(26);
    }

    @Test
    public void updateBook() {
        bookService.updateBook(new Book(22,"社会我或个，人狠话不多","1125",new BigDecimal(999999),10,111110,null));
    }

    @Test
    public void queryBookById() {
        System.out.println(bookService.queryBookById(19));
    }

    @Test
    public void queryBooks() {
       for(Book queryBooks:bookService.queryBooks()){
           System.out.println(queryBooks);
       }
    }
}