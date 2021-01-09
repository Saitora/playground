package ru.turtagor.loggenerator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TimeController {

    @GetMapping("time")
    String getCurrentTime() {
        return LocalDateTime.now().toString();
    }

}
