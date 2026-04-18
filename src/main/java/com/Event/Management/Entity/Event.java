package com.Event.Management.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data

public class Event {
    @Id
    private Long eventId;
    private String name;
    @Column(nullable = false)
    private LocalDate eventDate;
    @OneToMany(mappedBy = "event",cascade = CascadeType.ALL)
    private List<User> users;

}
