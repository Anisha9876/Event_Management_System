package com.Event.Management.Service;

import com.Event.Management.DTO.EventDto;
import com.Event.Management.Entity.Event;
import com.Event.Management.Mapper.EventMapper;
import com.Event.Management.Repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Event getDetailsOfEvent(Long eventId){
        return  eventRepo.findById(eventId)
                .orElseThrow(() -> new RuntimeException("Event not found with id: " + eventId));
    }
    public List<Event> getEvents(){
        List<Event> allEvents = eventRepo.findAll();
        return allEvents;
    }
    public Event updateEvent(Event event,Long eventId){
        Event existEvent = eventRepo.findById(eventId).orElseThrow(() -> new RuntimeException("Event nout found with id: " + eventId));
        Event update = eventRepo.save(event);
        existEvent.setEventDate(update.getEventDate());
        existEvent.setName(update.getName());
        return existEvent;

    }
    public Event deleteEvent(Long eventId){

        Event event = eventRepo.findById(eventId).orElseThrow(() -> new RuntimeException("Event not found with id: " + eventId));
        eventRepo.deleteById(eventId);

        return event;

    }
}
