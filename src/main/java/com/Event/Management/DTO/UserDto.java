package com.Event.Management.DTO;

import com.Event.Management.Entity.Event;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String username;
    private String password;
    private String role;
    @Email
    private String mail;
    private String eventName="Hacker36";
    private String phone;
    private Long eventId;
}
