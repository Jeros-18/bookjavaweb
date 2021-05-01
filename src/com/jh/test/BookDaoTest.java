package com.jh.test;

import com.jh.dao.BookDao;
import com.jh.dao.impl.BookDaoImpl;
import com.jh.pojo.Book;
import com.jh.service.BookService;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BookDaoTest {

    private BookDao bookDao = new BookDaoImpl();

    @Test
    public void addBook() {
        bookDao.addBook(new Book(null,"国哥为什么这么帅！","191125",new BigDecimal(9999),1100000,0,null));
    }

    @Test
    public void deleteBookById() {
        bookDao.deleteBookById(24);
    }

    @Test
    public void updateBook() {
        bookDao.updateBook(new Book(20,"大家都可这么帅111","国哥",new BigDecimal(9999),1100000,0,null));
    }

    @Test
    public void queryBookById() {
        System.out.println(bookDao.queryBookById(20));
    }

    @Test
    public void queryBooks() {
        for(Book queryBook:bookDao.queryBooks()){
            System.out.println(queryBook);
        }
    }
}