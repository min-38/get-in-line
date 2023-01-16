package com.fastcampus.getinline.domains;

import com.fastcampus.getinline.constants.EventStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Event {
    private Long id;

    private Long PlaceId;
    private String eventName;
    private EventStatus eventStatus;
    private LocalDateTime eventStartDatetime;
    private LocalDateTime eventEndDatetime;
    private Integer currentNumberOfPeople;
    private Integer capacity;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
