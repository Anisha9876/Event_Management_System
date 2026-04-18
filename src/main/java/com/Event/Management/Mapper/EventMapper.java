package com.Event.Management.Mapper;

import com.Event.Management.DTO.EventDto;
import com.Event.Management.DTO.UserDto;
import com.Event.Management.Entity.Event;
import com.Event.Management.Entity.User;
import com.Event.Management.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventMapper {
    @Autowired
    UserRepo userRepo;
    public EventDto eventToEventDto(Event event){
        EventDto eventDto=new EventDto();
        eventDto.setName(event.getName());
        eventDto.setEventDate(event.getEventDate());
        eventDto.setEventId(event.getEventId());


        List<UserDto> users=event.getUsers().stream().map(u->
                {
                    UserDto userDto=new UserDto();
                    userDto.setEventName(u.getEventName());
                    userDto.setId(u.getId());
                    userDto.setMail(u.getMail());
                    userDto.setRole(u.getRole());
                    userDto.setUsername(u.getUsername());
                    userDto.setPhone(u.getPhone());
                    userDto.setPassword(u.getPassword());
                     return userDto;
                }

        ).toList();
        eventDto.setUsers(users);
        return eventDto;
    }

    public Event eventDtoToEvent(EventDto eventDto){
        Event event=new Event();
        event.setName(eventDto.getName());
        event.setEventDate(eventDto.getEventDate());
        event.setEventId(eventDto.getEventId());


        List<User> users=event.getUsers().stream().map(u->
                {
                    User user=new User();
                    user.setEventName(u.getEventName());
                    user.setId(u.getId());
                    user.setMail(u.getMail());
                    user.setRole(u.getRole());
                    user.setUsername(u.getUsername());
                    user.setPhone(u.getPhone());
                    user.setPassword(u.getPassword());
                    return user;
                }

        ).toList();
        event.setUsers(users);
        return event;
    }
}
