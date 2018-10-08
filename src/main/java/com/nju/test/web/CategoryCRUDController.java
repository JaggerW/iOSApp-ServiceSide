package com.nju.test.web;

import com.nju.test.entity.Category;
import com.nju.test.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CategoryCRUDController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/getgoods", method = RequestMethod.GET)
    private Map<String,Object> getGoods(Integer storeId){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        List<Category> list = categoryService.getGoodsList(storeId);
        modelMap.put("data", list);
        return modelMap;
    }
}
