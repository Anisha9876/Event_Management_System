package com.Event.Management.DTO;

import com.Event.Management.Entity.User;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class EventDto {
    private Long eventId;
    private String name;
    private LocalDate eventDate;
    private List<UserDto> users;
}
