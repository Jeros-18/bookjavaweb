package com.jh.web;

import com.jh.pojo.Book;
import com.jh.service.BookService;
import com.jh.service.impl.BookServiceImpl;
import com.jh.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BookServlet extends BaseServlet{

    private BookService bookService = new BookServiceImpl();


    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*获取请求参数==封装成为Book对象*/
        Book book = WebUtils.copyParamToBean(req.getParameterMap(),new Book());
        /*保存图书*/
        bookService.addBook(book);
        /*跳转图书列表页面*/
        resp.sendRedirect(req.getContextPath()+"/manager/bookServlet?action=list");
    }


    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id=WebUtils.parseInt(req.getParameter("id"),0);
        bookService.deleteBookById(id);
        resp.sendRedirect(req.getContextPath()+"/manager/bookServlet?action=list");
    }


    protected void getBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int id=WebUtils.parseInt(req.getParameter("id"),0);
       Book book=bookService.queryBookById(id);
       req.setAttribute("book",book);
       req.getRequestDispatcher("/pages/manager/book_edit.jsp").forward(req,resp);
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book book=WebUtils.copyParamToBean(req.getParameterMap(),new Book());
        bookService.updateBook(book);
        resp.sendRedirect(req.getContextPath()+"/manager/bookServlet?action=list");

    }

    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> books = bookService.queryBooks();
        req.setAttribute("books",books);
        req.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(req,resp);
    }
}
