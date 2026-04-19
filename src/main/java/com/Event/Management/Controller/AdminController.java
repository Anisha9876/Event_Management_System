package com.Event.Management.Controller;


import com.Event.Management.DTO.EventDto;
import com.Event.Management.Entity.Event;
import com.Event.Management.Entity.User;
import com.Event.Management.Mapper.EventMapper;
import com.Event.Management.Service.EventService;
import com.Event.Management.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/event")
public class AdminController {

    @Autowired
    UserService service;

    @Autowired
    EventService eventService;

    @GetMapping("/allEvents")
    public ResponseEntity<List<EventDto>> viewAllEvent(){
        List<Event> events = eventService.getEvents();
        List<EventDto> result = events.stream().map(EventMapper::eventToEventDto).toList();
        return ResponseEntity.ok(result);
    }
    @GetMapping("/getUser")
    public List<User> getUser(){
        List<User> userDetails = service.getUserDetails();
        return userDetails;
    }
    public void systemLevelAction(){

    }


}
