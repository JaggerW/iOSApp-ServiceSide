package com.nju.test.service;

import com.nju.test.entity.Goods;

import java.util.List;

public interface GoodsService {

    List<Goods> getAllGoods();

    List<Goods> getGoodsList(int storeId);

    Goods getGoodsById(int goodsId);

    boolean addGoods(Goods goods);

    boolean modifyGoods(Goods goods);

    boolean deleteGoods(int goodsId);
}
