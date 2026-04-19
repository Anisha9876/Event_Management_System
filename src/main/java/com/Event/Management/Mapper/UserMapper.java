package com.Event.Management.Mapper;

import com.Event.Management.DTO.UserDto;
import com.Event.Management.Entity.Event;
import com.Event.Management.Entity.User;
import com.Event.Management.Repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserMapper {
    @Autowired
    EventRepo eventRepo;

    public UserDto userToUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setMail(user.getMail());
        userDto.setPhone(user.getPhone());
        userDto.setPassword(user.getPassword());
        userDto.setRole(user.getRole());
        userDto.setUsername(user.getUsername());
        userDto.setEventName(user.getEventName());
        return userDto;
    }
    public User userDtoToUser(UserDto userDto){

        User user=new User();
        user.setMail(userDto.getMail());
        user.setPhone(userDto.getPhone());
        user.setUsername(userDto.getUsername());
        user.setRole(userDto.getRole());
        user.setPassword(userDto.getPassword());
        if(userDto.getEventId() != null){
            Optional<Event> event = eventRepo.findById(userDto.getEventId());
            if(event.isPresent()){
                user.setEvent(event.get()); // IMPORTANT
            } else {
                throw new RuntimeException("Event not found");
            }
        }

        return user;
    }
}
