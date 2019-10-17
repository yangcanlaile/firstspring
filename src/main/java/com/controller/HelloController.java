package com.controller;

import com.entity.User;
import com.service.UserServiceImp;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    private final static Log logger = LogFactory.getLog(HelloController.class);
    @Autowired
    UserServiceImp userServiceImp;
    @GetMapping
    public String hello(){

        User user = userServiceImp.selectByPrimaryKey(1);
        logger.info("Can access the database!");
        System.out.println("sout -Can access the database!");
        return "username: " + user.getUserName() + "password: " + user.getPassword();
    }

}
