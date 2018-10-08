package com.nju.test.serviceImpl;

import com.nju.test.dao.GoodsMapper;
import com.nju.test.dao.GoodsMapperDIY;
import com.nju.test.entity.Goods;
import com.nju.test.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private GoodsMapperDIY goodsMapperDIY;

    @Override
    public List<Goods> getAllGoods() {
        return null;
    }

    @Override
    public List<Goods> getGoodsList(int storeId) {
        return goodsMapperDIY.selectByStoreId(storeId);
    }

    @Override
    public Goods getGoodsById(int goodsId) {
        return null;
    }

    @Override
    public boolean addGoods(Goods goods) {
        return false;
    }

    @Override
    public boolean modifyGoods(Goods goods) {
        return false;
    }

    @Override
    public boolean deleteGoods(int goodsId) {
        return false;
    }
}
