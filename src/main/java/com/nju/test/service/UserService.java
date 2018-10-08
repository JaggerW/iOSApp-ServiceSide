package com.nju.test.service;

import com.nju.test.entity.Store;
import com.nju.test.entity.User;

import java.util.List;

public interface UserService {

    List<User> getUserList();

    User getUserById(int userId);

    boolean addUser(User user);

    boolean modifyUser(User user);

    boolean deleteUser(int userId);
}
