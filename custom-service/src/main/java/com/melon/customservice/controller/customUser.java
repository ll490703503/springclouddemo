package com.melon.customservice.controller;


/**
 * @Description
 * @auther panwang1
 * @create 2019-03-05 15:31
 */

import com.melon.userservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(value = "user")
@RestController

public class customUser{

    @Autowired
    RestTemplate restTemplate;

    @PostMapping(value = "getUser")

    public List<User> getUserList(){

        List<User> userList = new ArrayList<>();
        userList = restTemplate.getForObject("http://user-service:8081/api/getUserList",List.class);
        return userList;

    }


}