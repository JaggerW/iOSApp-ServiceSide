package com.nju.test.web;


import com.nju.test.entity.Address;
import com.nju.test.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AddressCRUDController {
    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/getaddress", method = RequestMethod.GET)
    private Map<String,Object> getaddress(Integer addressId){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        Address address = addressService.getAddressById(addressId);
        modelMap.put("data", address);
        return modelMap;
    }

    @RequestMapping(value = "/listaddress", method = RequestMethod.GET)
    private Map<String,Object> listAddress(Integer userId){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        List<Address> list = addressService.getAddressList(userId);
        modelMap.put("data", list);
        return modelMap;
    }

    @RequestMapping(value = "/addaddress", method = RequestMethod.POST)
    private Map<String,Object> addAddress(@RequestBody Address address){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", addressService.addAddress(address));
        return modelMap;
    }

    @RequestMapping(value = "/modifyaddress", method = RequestMethod.POST)
    private Map<String,Object> modifyAddress(@RequestBody Address address){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", addressService.modifyAddress(address));
        return modelMap;
    }

    @RequestMapping(value = "/removeaddress", method = RequestMethod.DELETE)
    private Map<String,Object> removeAddress(Integer addressId){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", addressService.deleteAddress(addressId));
        return modelMap;
    }

}
