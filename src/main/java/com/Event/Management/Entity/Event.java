package com.Event.Management.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Event {
    @Id
    private String eventId;
    private String name;
    @Column(nullable = false)
    private LocalDate eventDate;

}
