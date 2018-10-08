package com.nju.test.dao;

import com.nju.test.entity.Goods;

import java.util.List;

public interface GoodsMapperDIY {

    List<Goods> selectByStoreId(Integer storeId);
}
