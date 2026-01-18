package com.Event.Management.Controller;


import com.Event.Management.Entity.User;
import com.Event.Management.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/event")
public class AdminController {

    @Autowired
    UserService service;


    public void viewAllEvent(){

    }
    @GetMapping("/getUser")
    public List<User> getUser(){
        List<User> userDetails = service.getUserDetails();
        return userDetails;
    }

    public void systemLevelAction(){

    }


}
