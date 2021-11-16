package com.moon.library.service;

import com.moon.library.pojo.Book;
import com.moon.library.pojo.Category;
import com.moon.library.util.PageBean;

import java.util.List;
import java.util.Map;

public interface BookService {
    PageBean<Book> queryBookPage(Map<String, Object> paramMap);

    List<Category> listCategory();

    void addBook(Book book);

    void selectBookById(int book_id);

    void updateBook(Book book);

    void deleteBook(int book_id);

}
