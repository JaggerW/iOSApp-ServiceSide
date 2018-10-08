package com.nju.test.dao;

import com.nju.test.entity.Order;

public interface OrderMapperDIY {

    Order selectByPrimaryKey(String orderId);

    int updateFlag(String orderId);

}
