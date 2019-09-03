package com.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.entity.User;
import com.service.UserServiceImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("api/hello")
public class UserController {

    @Resource
    private UserServiceImp userServiceImp;

    @GetMapping
    public String Get() {
        User user = userServiceImp.selectByPrimaryKey(1);
        return JSON.toJSONString(user, SerializerFeature.WriteMapNullValue);
    }
}
