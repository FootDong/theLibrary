package com.moon.library.dao;

import com.moon.library.pojo.Category;

import java.util.ArrayList;

public interface CategoryMapper {

    ArrayList<Category> listCategories();//显示所有分类

    void updateBookCategory(Category category);//更新书本分类

    void  delBookCategory(Integer cid);//删除书本分类

    void addBookCategory(String cname);//添加书本分类
}
