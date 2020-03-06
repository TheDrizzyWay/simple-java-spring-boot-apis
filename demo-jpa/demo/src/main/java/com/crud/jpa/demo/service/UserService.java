package com.crud.jpa.demo.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.crud.jpa.demo.entity.User;

import org.springframework.stereotype.Repository;

/**
 * UserService
 */
@Repository
@Transactional
public class UserService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user) {
        this.entityManager.persist(user);
        return user.getId();
    }
    
}