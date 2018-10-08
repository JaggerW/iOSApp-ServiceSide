package com.nju.test.web;

import com.nju.test.entity.Store;
import com.nju.test.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StoreCRUDController {

    @Autowired
    private StoreService storeService;

    /**
     * 获取所有店铺列表
     * @return
     */
    @RequestMapping(value = "/liststore", method = RequestMethod.GET)
    private Map<String,Object> listStore(){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        List<Store> list = storeService.getStoreList();
        modelMap.put("storeList", list);
        return modelMap;
    }

    @RequestMapping(value = "/getstorebyid", method = RequestMethod.GET)
    private Map<String,Object> getStoreById(Integer storeId){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        Store store = storeService.getStoreById(storeId);
        modelMap.put("store", store);
        return modelMap;
    }

    @RequestMapping(value = "/addstore", method = RequestMethod.POST)
    private Map<String,Object> addStore(@RequestBody Store store){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", storeService.addStore(store));
        return modelMap;
    }

    @RequestMapping(value = "/modifystore", method = RequestMethod.POST)
    private Map<String,Object> modifyStore(@RequestBody Store store){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", storeService.modifyStore(store));
        return modelMap;
    }

    @RequestMapping(value = "/removestore", method = RequestMethod.GET)
    private Map<String,Object> removeStore(Integer storeId){
        Map<String,Object> modelMap = new HashMap<String, Object>();

        modelMap.put("success", storeService.deleteStore(storeId));
        return modelMap;
    }
}
