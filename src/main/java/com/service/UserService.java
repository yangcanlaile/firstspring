package com.service;

import com.entity.User;

public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User user);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKey(User user);





}
