package com.nju.test.serviceImpl;

import com.nju.test.dao.CategoryMapper;
import com.nju.test.dao.CategoryMapperDIY;
import com.nju.test.entity.Category;
import com.nju.test.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private CategoryMapperDIY categoryMapperDIY;

    @Override
    public List<Category> getAllCategory() {
        return categoryMapper.selectAll();
    }

    @Override
    public List<Category> getGoodsList(int storeId) {
        return categoryMapperDIY.selectByStoreId(storeId);
    }

    @Override
    public Category getCategoryById(int categoryId) {
        return null;
    }

    @Override
    public boolean addCategory(Category category) {
        return false;
    }

    @Override
    public boolean modifyCategory(Category category) {
        return false;
    }

    @Override
    public boolean deleteCategory(int categoryId) {
        return false;
    }
}
