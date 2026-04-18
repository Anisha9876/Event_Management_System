    package com.Event.Management.Mapper;

    import com.Event.Management.DTO.EventDto;
    import com.Event.Management.DTO.UserDto;
    import com.Event.Management.Entity.Event;
    import com.Event.Management.Entity.User;
    import com.Event.Management.Repository.UserRepo;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Component;

    import java.util.List;

    @Component
    public class EventMapper {
        @Autowired
        UserRepo userRepo;
        public EventDto eventToEventDto(Event event) {
            EventDto eventDto = new EventDto();
            eventDto.setName(event.getName());
            eventDto.setEventDate(event.getEventDate());
            eventDto.setEventId(event.getEventId());

            if (event.getUsers() != null) {
                List<UserDto> users = event.getUsers().stream().map(u ->
                        {
                            UserDto userDto = new UserDto();
                            userDto.setEventName(u.getEventName());
                            userDto.setId(u.getId());
                            userDto.setMail(u.getMail());
                            userDto.setRole(u.getRole());
                            userDto.setUsername(u.getUsername());
                            userDto.setPhone(u.getPhone());
                            userDto.setPassword(u.getPassword());
                            return userDto;
                        }

                ).toList();

                eventDto.setUsers(users);

            }
            return eventDto;
        }

        public Event eventDtoToEvent(EventDto eventDto){
            Event event=new Event();
            event.setName(eventDto.getName());
            event.setEventDate(eventDto.getEventDate());
           if(eventDto.getUsers() != null) {
               List<User> users = eventDto.getUsers().stream().map(u ->
                       {
                           User user = new User();
                           user.setEventName(u.getEventName());
                           user.setMail(u.getMail());
                           user.setRole(u.getRole());
                           user.setUsername(u.getUsername());
                           user.setPhone(u.getPhone());
                           user.setPassword(u.getPassword());
                           user.setEvent(event);

                           return user;
                       }

               ).toList();

               event.setUsers(users);
           }
            return event;
        }
    }
