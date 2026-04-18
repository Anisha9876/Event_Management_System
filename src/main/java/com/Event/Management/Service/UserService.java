package com.Event.Management.Service;

import com.Event.Management.DTO.UserDto;
import com.Event.Management.Entity.Event;
import com.Event.Management.Entity.User;
import com.Event.Management.Mapper.UserMapper;
import com.Event.Management.Repository.EventRepo;
import com.Event.Management.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    EventRepo eventRepo;
    @Autowired
    UserMapper userMapper;

    public User registerUser(UserDto userdto) {
        User user = userMapper.userDtoToUser(userdto);
        User user1 = userRepo.save(user);
        return user1;
    }

    public List<User> getUserDetails() {
        List<User> all = userRepo.findAll();
        return all;
    }

    public List<Event> getRegisteredEvents(Long userId) {
       User user = userRepo.findById(userId)
                .orElseThrow(()-> new RuntimeException("User Not Found"));
        return List.of(user.getEvent());

    }
}
