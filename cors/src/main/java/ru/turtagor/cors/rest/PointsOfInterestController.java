package ru.turtagor.cors.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Controller
@RequestMapping("/points-of-interest")
public class PointsOfInterestController {

    @GetMapping
    @ResponseBody
    public Mono<List<String>> get() {
        return Flux.just("a", "b", "c").collectList();
    }

}
