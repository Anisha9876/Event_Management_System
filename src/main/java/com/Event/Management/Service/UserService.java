package com.Event.Management.Service;

import com.Event.Management.Entity.User;
import com.Event.Management.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo repo;
    public User registerUser(User user) {
        User user1 = repo.save(user);
        System.out.println(user.getMail());
        return user1;
    }
}
