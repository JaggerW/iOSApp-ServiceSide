package com.nju.test.web;

import com.nju.test.entity.Goods;
import com.nju.test.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GoodsCRUDController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/getgoodsbystoreid", method = RequestMethod.GET)
    private Map<String,Object> getGoodsByStoreId(Integer storeId){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        List<Goods> list = goodsService.getGoodsList(storeId);
        modelMap.put("data", list);
        return modelMap;
    }
}
