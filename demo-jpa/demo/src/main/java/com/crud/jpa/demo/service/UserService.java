package com.crud.jpa.demo.service;

import com.crud.jpa.demo.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User insert(String name) {
        return userRepository.findByName(name);
    }
    
}