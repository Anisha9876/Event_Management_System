package com.Event.Management.DTO;

import com.Event.Management.Entity.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class EventDto {
    private Long eventId;
    private String name;
    private LocalDate eventDate;
    private List<UserDto> users;
}
