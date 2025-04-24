package com.example.Speaking.Clock.controller;

import com.example.Speaking.Clock.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/time")
public class TimeController {

    @Autowired
    private TimeService timeService;

    @GetMapping("/convert")
    public String convertTime(@RequestParam String time) {
        return timeService.convertTimeToWords(time);
    }
}
