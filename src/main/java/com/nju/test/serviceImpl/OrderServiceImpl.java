package com.nju.test.serviceImpl;

import com.nju.test.dao.OrderGoodsMapper;
import com.nju.test.dao.OrderGoodsMapperDIY;
import com.nju.test.dao.OrderMapper;
import com.nju.test.dao.OrderMapperDIY;
import com.nju.test.entity.Order;
import com.nju.test.entity.OrderGoods;
import com.nju.test.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderMapperDIY orderMapperDIY;
    @Autowired
    private OrderGoodsMapperDIY orderGoodsMapperDIY;

    @Override
    public List<Order> getOrderList(int userId) {
        return orderMapper.selectAll(userId);
    }

    @Override
    public Order getOrderById(String orderId) {
        return orderMapperDIY.selectByPrimaryKey(orderId);
    }

    @Override
    public boolean addOrder(Order order) {
        List<OrderGoods> list = order.getGoods();
        int effectedNum = orderMapper.insert(order) + orderGoodsMapperDIY.insertRecordBatch(list);
        if (effectedNum > 1){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean modifyOrder(Order order) {
        int effectedNum = orderMapper.updateByPrimaryKey(order);
        if (effectedNum > 0){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean deleteOrder(String orderId) {
        int eNum = orderGoodsMapperDIY.deleteByOrderId(orderId);
        int effectedNum = orderMapper.deleteByPrimaryKey(orderId);
        if (effectedNum + eNum > 1){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean updateFlag(String orderId) {
        int effectedNum = orderMapperDIY.updateFlag(orderId);
        if (effectedNum > 0){
            return true;
        } else {
            return false;
        }
    }
}
