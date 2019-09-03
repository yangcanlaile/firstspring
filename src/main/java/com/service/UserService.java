package com.service;

import com.entity.User;

public interface UserService {
    public int deleteByPrimaryKey(Integer id);

    public int insert (User user);

    public User selectByPrimaryKey(Integer uid);

    public int updateByPrimaryKey(User user);





}
