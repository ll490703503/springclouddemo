package com.melon.userservice.service;

import com.melon.userservice.mapper.UserMapper;
import com.melon.userservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @auther panwang1
 * @create 2019-03-05 14:24
 */


@Service
public class UserService {

    @Autowired
    UserMapper userMapper;


    public List<User> getUsers(){
        List<User> userList = new ArrayList<>();
        userList = userMapper.getAllUser();
        return  userList;
    }
}
