package com.moon.library.service.impl;

import com.moon.library.dao.BookMapper;
import com.moon.library.pojo.Book;
import com.moon.library.pojo.Category;
import com.moon.library.service.BookService;
import com.moon.library.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public PageBean<Book> queryBookPage(Map<String, Object> paramMap) {
        PageBean<Book> pageBean = new PageBean<Book>((Integer) paramMap.get("pageno"),(Integer) paramMap.get("pagesize"));
        Integer startIndex = pageBean.getStartIndex();
        paramMap.put("startIndex",startIndex);
        List<Book> datas = bookMapper.queryBookList(paramMap);
        pageBean.setDatas(datas);

        Integer totalsize = bookMapper.queryBookCount(paramMap);
        pageBean.setTotalsize(totalsize);
        return pageBean;
    }

    @Override
    public List<Category> listCategory() {
        return bookMapper.listCategory();
    }

    @Override
    public void addBook(Book book) {
        bookMapper.addBook(book);
    }

    @Override
    public void selectBookById(int book_id) {
        bookMapper.selectBookById(book_id);
    }

    @Override
    public void updateBook(Book book) {
    bookMapper.updateBook(book);
    }

    @Override
    public void deleteBook(int book_id) {
    bookMapper.deleteBook(book_id);
    }


}
