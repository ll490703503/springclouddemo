package com.melon.userservice.controller;

import com.melon.userservice.model.User;
import com.melon.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @auther panwang1
 * @create 2019-03-05 14:24
 */

@RequestMapping(value = "/api")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/getUserList")
    public List<User> getAllUser(){
        return userService.getUsers();
    }


}
