package com.nju.test.dao;

import com.nju.test.entity.OrderGoods;

import java.util.List;

public interface OrderGoodsMapperDIY {


    int insertRecordBatch(List<OrderGoods> record);

    int deleteByOrderId(String orderId);

}
