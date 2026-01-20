package com.Event.Management.Mapper;

import com.Event.Management.DTO.EventDto;
import com.Event.Management.Entity.Event;
import com.Event.Management.Entity.User;
import com.Event.Management.Repository.EventRepo;
import com.Event.Management.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EventMapper {
    @Autowired
    UserRepo userRepo;
    public void eventToEventDto(Event event){
        EventDto eventDto=new EventDto();
        event.setName(eventDto.getName());
        event.setEventDate(eventDto.getEventDate());
        event.setEventId(eventDto.getEventId());
        Optional<User> user = userRepo.findById(event.getEventId());
        if(user != null){
//            event.setUsers(user);
        }
    }
}
