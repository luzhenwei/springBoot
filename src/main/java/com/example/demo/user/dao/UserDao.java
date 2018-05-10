package com.example.demo.user.dao;

import com.example.demo.user.domain.User;

public interface UserDao {

    public int insert(User user);

    public int deleteById(Integer id);

    public int update(User user);

    public User getById(Integer id);
}
