package com.moon.library.dao;

import com.moon.library.pojo.Book;
import com.moon.library.pojo.Category;

import java.util.List;
import java.util.Map;

public interface BookMapper {

    List<Book> queryBookList(Map<String, Object> paramMap);

    Integer queryBookCount(Map<String, Object> paramMap);

    List<Category> listCategory();

    void addBook(Book book);

    void selectBookById(int book_id);

    void updateBook(Book book);

    void deleteBook(int book_id);

    void reduceStock(Integer book_id);
}
