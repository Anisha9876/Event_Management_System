package com.Event.Management.Controller;

import com.Event.Management.DTO.EventDto;
import com.Event.Management.Entity.Event;
import com.Event.Management.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/event")
public class EventController {
    @Autowired
    EventService eventService;

    @PostMapping("/create")
    public ResponseEntity<Event> createEvent(@RequestBody EventDto eventDto){
        Event event = eventService.createEvent(eventDto);
        return ResponseEntity.status(HttpStatus.OK).body(event);
    }
    @GetMapping("/getDetails")
    public ResponseEntity<Event> getEventDetails(@RequestParam Long eventId){
        Event event = eventService.getDetailsOfEvent(eventId);
        return ResponseEntity.ok(event);
    }
    @PutMapping("/update")
    public void updateEvent(){

    }
    @DeleteMapping("/delete")
    public void deleteEvent(){

    }


}
