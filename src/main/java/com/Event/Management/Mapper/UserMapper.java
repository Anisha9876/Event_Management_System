package com.Event.Management.Mapper;

import com.Event.Management.DTO.UserDto;
import com.Event.Management.Entity.User;

public class UserMapper {
    UserDto userDto;
    public void userToUserDto(User user){
        userDto.setId(user.getId());
        userDto.setMail(userDto.getMail());
        userDto.setPhone(userDto.getPhone());
        userDto.setPassword(userDto.getPassword());
        userDto.setEventId(userDto.getEventId());
        userDto.setRole(userDto.getRole());
        userDto.setUsername(userDto.getUsername());
        userDto.setEventName(userDto.getEventName());
    }
}
