package com.nju.test.service;

import com.nju.test.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategory();

    List<Category> getGoodsList(int storeId);

    Category getCategoryById(int categoryId);

    boolean addCategory(Category category);

    boolean modifyCategory(Category category);

    boolean deleteCategory(int categoryId);
}
