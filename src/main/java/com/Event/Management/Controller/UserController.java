package com.Event.Management.Controller;

import com.Event.Management.Entity.Event;
import com.Event.Management.Entity.User;
import com.Event.Management.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("/allEvents/{userId}")
    public Optional<Event> seeAllRegisterEvent(@PathVariable Long userId){
        Optional<Event> registeredEvents = userService.getRegisteredEvents(userId);
        return registeredEvents;
    }
    public void cancelEvent(){

    }
    public void updateOwnEvent(){

    }

}
