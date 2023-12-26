package com.scratchapp.demo.dao;

import com.scratchapp.demo.entity.user;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class userDAOImpl implements userDAO{

    private EntityManager entityManager;

    @Autowired
    public userDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<user> getAllData() {
        TypedQuery<user> Query_ = entityManager.createQuery("From user", user.class);
        List<user> allData = Query_.getResultList();
        return allData;
    }

    @Override
    public user getSingleData(int eid) {
        user us = entityManager.find(user.class, eid);
        return us;
    }

    @Override
    public void deleteSingleData(int eid) {
        user us = entityManager.find(user.class, eid);
        entityManager.remove(us);
    }

    @Override
    public user saveData(user userParam) {
        user us = entityManager.merge(userParam);
        return us;
    }

}
