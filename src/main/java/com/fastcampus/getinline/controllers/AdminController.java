package com.fastcampus.getinline.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin") // 아래 모든 함수는 admin으로 시작하도록
@Controller
public class AdminController {

    @GetMapping("/")
    public String adminPlaces() {
        return "Admin/places";
    }

    @GetMapping("/places/{placeId}")
    public String adminPlaceDetail(@PathVariable Integer placeId) {
        return "Admin/place-detail";
    }

    @GetMapping("/")
    public String events() {
        return "Admin/events";
    }

    @GetMapping("/events/{eventId}")
    public String adminEventDetail(@PathVariable Integer eventId) {
        return "Admin/event-detail";
    }
}
