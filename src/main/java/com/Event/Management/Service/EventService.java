package com.Event.Management.Service;

import com.Event.Management.DTO.EventDto;
import com.Event.Management.Entity.Event;
import com.Event.Management.Mapper.EventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    EventMapper eventMapper;
    public void createEvent(EventDto eventDto){
        eventMapper.ev

    }
}
