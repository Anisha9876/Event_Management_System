package com.Event.Management.Controller;

import com.Event.Management.Entity.User;
import com.Event.Management.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/regi")
    public ResponseEntity<User> register(@Valid @RequestBody User user){
        User log = userService.registerUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(log);
    }

}
