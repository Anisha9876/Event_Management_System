package com.Event.Management.Controller;

import com.Event.Management.DTO.EventDto;
import com.Event.Management.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class EventController {
    @Autowired
    EventService eventService;

    @PostMapping("/create")
    public ResponseEntity<EventDto> createEvent(@RequestBody EventDto eventDto){
        EventDto event = eventService.createEvent(eventDto);
        return ResponseEntity.status(HttpStatus.OK).body(event);
    }
    public void updateEvent(){

    }
    public void deleteEvent(){

    }
    public void getEventDetails(){

    }

}
