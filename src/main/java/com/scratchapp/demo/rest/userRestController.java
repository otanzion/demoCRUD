package com.scratchapp.demo.rest;

import com.scratchapp.demo.entity.user;
import com.scratchapp.demo.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class userRestController {

    private userService userservice_;

    @Autowired
    public userRestController(userService userservice) {
        this.userservice_ = userservice;
    }

    @GetMapping("/user")
    public List<user> getAll(){
        return userservice_.getAllData();
    }

    @GetMapping("/user/{id}")
    public user getOnlyOne(@PathVariable int id){
        return userservice_.getSingleData(id);
    }

    @PutMapping("/user")
    public user updateData(@RequestBody user us)
    {
        user newUserData = userservice_.saveData(us);
        return newUserData;
    }

    @PostMapping("/user")
    public user createData(@RequestBody user us)
    {
        us.setId(0);
        user newData = userservice_.saveData(us);
        return newData;
    }
    @DeleteMapping("/user/{id}")
    public String deleteData(@PathVariable int id)
    {
        user rn = userservice_.getSingleData(id);
        userservice_.deleteSingleData(id);

        if(rn == null){
            throw  new RuntimeException(("User id not found - "+ id));

        }
         return "Deleted employee id - "+id;

    }


}






