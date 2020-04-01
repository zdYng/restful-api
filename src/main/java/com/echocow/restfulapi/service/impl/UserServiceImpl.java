package com.echocow.restfulapi.service.impl;

import com.echocow.restfulapi.entry.User;
import com.echocow.restfulapi.repository.UserRepository;
import com.echocow.restfulapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user){
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user){
        return userRepository.save(user);
    }

    @Override
    public User getById(Long id){
        return userRepository.getOne(id);
    }

    @Override
    public User getByUserName(String username){
        return userRepository.findUserByUsername(username);
    }

    @Override
    public List<User> queryAll(){
        return userRepository.findAll();
    }

    @Override
    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

}
