package com.Event.Management.Controller;

import com.Event.Management.DTO.UserDto;
import com.Event.Management.Entity.Event;
import com.Event.Management.Entity.User;
import com.Event.Management.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    public UserController(UserService userService){

        this.userService = userService;
    }

    @PostMapping("/regi")
    public ResponseEntity<User> register(@Valid @RequestBody UserDto userdto){
        User log = userService.registerUser(userdto);
        return ResponseEntity.status(HttpStatus.CREATED).body(log);
    }

    @GetMapping("/allEvents/{userId}")
    public List<Event> seeAllRegisterEvent(@PathVariable Long userId){
        List<Event> registeredEvents = userService.getRegisteredEvents(userId);
        return registeredEvents;
    }
    public void cancelEvent(){

    }
    public void updateOwnEvent(){

    }

}
