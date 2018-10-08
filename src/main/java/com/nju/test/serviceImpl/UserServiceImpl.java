package com.nju.test.serviceImpl;

import com.nju.test.dao.UserMapper;
import com.nju.test.entity.User;
import com.nju.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return null;
    }

    @Override
    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public boolean addUser(User user) {
        int effectedNum = userMapper.insert(user);
        if (effectedNum > 0){
            return true;
        } else {
            throw new RuntimeException("失败！");
        }
    }

    @Override
    public boolean modifyUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(int userId) {
        return false;
    }
}
