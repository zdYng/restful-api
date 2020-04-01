package com.echocow.restfulapi.service;

import com.echocow.restfulapi.entry.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    User updateUser(User user);

    User getById(Long id);

    User getByUserName(String username);

    List<User> queryAll();

    void deleteById(Long id);

}
