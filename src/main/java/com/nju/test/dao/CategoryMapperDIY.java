package com.nju.test.dao;

import com.nju.test.entity.Category;

import java.util.List;

public interface CategoryMapperDIY {

    List<Category> selectByStoreId(Integer storeId);

}
