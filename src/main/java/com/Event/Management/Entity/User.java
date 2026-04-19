package com.Event.Management.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name="EventUser")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String role;
    @Email
   private String mail;
    private String eventName="Hacker36";
    private String phone;
    @ManyToOne
    @JoinColumn(name="event_id")
    private Event event;
}
