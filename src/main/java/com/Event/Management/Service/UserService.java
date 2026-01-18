package com.Event.Management.Service;

import com.Event.Management.Entity.Event;
import com.Event.Management.Entity.User;
import com.Event.Management.Repository.EventRepo;
import com.Event.Management.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepo repo;

    @Autowired
    EventRepo eventRepo;

    public User registerUser(User user) {
        User user1 = repo.save(user);
        System.out.println(user.getMail());
        return user1;
    }

    public List<User> getUserDetails() {
        List<User> all = repo.findAll();
        return all;
    }

    public Optional<Event> getRegisteredEvents(Long userId) {
        Optional<Event> events = eventRepo.findById(userId);
        return events;

    }
}
