package com.moon.library.service;

import com.moon.library.pojo.Reader;
import com.moon.library.util.PageBean;

import java.util.List;
import java.util.Map;

public interface ReaderService {

    int checkReader(Integer reader_id);

    void addReader(Reader reader);

    Reader select(Reader rd);

    PageBean<Reader> listReader(Map<String, Object> paramMap);

    Reader selectById(Integer id);

    void updateReader(Reader reader);

    void delReader(Integer id);

    void alterpwd(Reader reader);
}
