package com.moon.library.service.impl;

import com.moon.library.dao.CategoryMapper;
import com.moon.library.pojo.Category;
import com.moon.library.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public ArrayList<Category> listCategories() {
        return categoryMapper.listCategories();
    }

    @Override
    public void updateBookCategory(Category category) {
        categoryMapper.updateBookCategory(category);
    }

    @Override
    public void delBookCategory(Integer cid) {
        categoryMapper.delBookCategory(cid);
    }

    @Override
    public void addBookCategory(String cname) {
        categoryMapper.addBookCategory(cname);
    }
}
