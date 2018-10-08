package com.nju.test.web;


import com.nju.test.entity.Order;
import com.nju.test.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OrderCRUDController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/getorder", method = RequestMethod.GET)
    private Map<String,Object> getOrder(String orderId){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        Order order = orderService.getOrderById(orderId);
        modelMap.put("data", order);
        return modelMap;
    }

    @RequestMapping(value = "/listorder", method = RequestMethod.GET)
    private Map<String,Object> listOrder(Integer userId){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        List<Order> list = orderService.getOrderList(userId);
        modelMap.put("data", list);
        return modelMap;
    }

    @RequestMapping(value = "/addorder", method = RequestMethod.POST)
    private Map<String,Object> addOrder(@RequestBody Order order){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", orderService.addOrder(order));
        return modelMap;
    }

    @RequestMapping(value = "/modifyorder", method = RequestMethod.POST)
    private Map<String,Object> modifyOrder(@RequestBody Order order){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", orderService.modifyOrder(order));
        return modelMap;
    }

    @RequestMapping(value = "/updateorderflag", method = RequestMethod.POST)
    private Map<String,Object> updateOrderFlag(String orderId){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", orderService.updateFlag(orderId));
        return modelMap;
    }

    @RequestMapping(value = "/removeorder", method = RequestMethod.DELETE)
    private Map<String,Object> removeOrder(String orderId){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", orderService.deleteOrder(orderId));
        return modelMap;
    }

}
