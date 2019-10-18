package com.controller;

import com.entity.User;
import com.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api/hello")
public class UserController {

    @Resource
    private UserServiceImp userServiceImp;

    @Autowired
    private List<User> userList;

    @GetMapping
    public String Get() {
        String outStr = "";
        for (User user : userList) {
            outStr += user.getUserName() + ": " + user.getPassword()+"<br//>";
        }
        return outStr;
    }
}
