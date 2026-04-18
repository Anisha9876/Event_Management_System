package com.Event.Management.Service;

import com.Event.Management.DTO.EventDto;
import com.Event.Management.Entity.Event;
import com.Event.Management.Mapper.EventMapper;
import com.Event.Management.Repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    EventMapper eventMapper;

    @Autowired
    EventRepo eventRepo;

    public Event createEvent(EventDto eventDto){
        Event event = eventMapper.eventDtoToEvent(eventDto);
        Event save = eventRepo.save(event);
        return save;

    }
}
