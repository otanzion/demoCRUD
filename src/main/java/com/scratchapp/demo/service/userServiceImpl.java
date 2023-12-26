package com.scratchapp.demo.service;

import com.scratchapp.demo.dao.userDAO;
import com.scratchapp.demo.entity.user;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService{

    private userDAO _userdao_;

    @Autowired
    public userServiceImpl(userDAO _userdao_) {
        this._userdao_ = _userdao_;
    }

    @Override
    public List<user> getAllData() {
        return _userdao_.getAllData();
    }

    @Override
    public user getSingleData(int eid) {
        return _userdao_.getSingleData(eid);
    }

    @Transactional
    @Override
    public void deleteSingleData(int eid) {
        _userdao_.deleteSingleData(eid);
    }

    @Transactional
    @Override
    public user saveData(user userParam) {
        return _userdao_.saveData(userParam);
    }
}
