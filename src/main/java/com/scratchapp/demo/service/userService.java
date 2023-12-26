package com.scratchapp.demo.service;

import com.scratchapp.demo.entity.user;

import java.util.List;

public interface userService {

    //get all data
    List<user> getAllData();

    //get single id
    user getSingleData(int eid);

    //update existing data
    void deleteSingleData(int eid);

    //save or update record
    user saveData(user userParam);

}
