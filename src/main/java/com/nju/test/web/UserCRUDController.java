package com.nju.test.web;


import com.nju.test.entity.Store;
import com.nju.test.entity.User;
import com.nju.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserCRUDController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getuser", method = RequestMethod.GET)
    private Map<String,Object> getUserById(Integer userId){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        User user = userService.getUserById(userId);
        modelMap.put("user", user);
        return modelMap;
    }

    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    private Map<String,Object> addStore(@RequestBody User user){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", userService.addUser(user));
        return modelMap;
    }
}
