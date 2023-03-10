package com.fastcampus.getinline.services;

import com.fastcampus.getinline.Repositories.EventRepository;
import com.fastcampus.getinline.constants.ErrorCode;
import com.fastcampus.getinline.constants.EventStatus;
import com.fastcampus.getinline.dto.EventDTO;
import com.fastcampus.getinline.exception.GeneralException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class EventService {

    private final EventRepository eventRepository;

    public List<EventDTO> getEvents(
            Long placeId,
            String eventName,
            EventStatus eventStatus,
            LocalDateTime eventStartDatetime,
            LocalDateTime eventEndDatetime
    ) {
        try {
            return eventRepository.findEvents(
                    placeId,
                    eventName,
                    eventStatus,
                    eventStartDatetime,
                    eventEndDatetime
            );
        }
        catch(Exception e) {
            throw new GeneralException(ErrorCode.DATA_ACCESS_ERROR);
        }

    }

    public Optional<EventDTO> getEvent(Long eventId) {
        return eventRepository.findEvent(eventId);
    }

    public boolean createEvent(EventDTO eventDTO) {
        return eventRepository.insertEvent(eventDTO);
    }

    public boolean modifyEvent(Long eventId, EventDTO dto) {
        return eventRepository.updateEvent(eventId, dto);
    }

    public boolean removeEvent(Long eventId) {
        return eventRepository.deleteEvent(eventId);
    }
}