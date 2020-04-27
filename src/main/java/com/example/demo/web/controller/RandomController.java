package com.example.demo.web.controller;

import com.example.demo.service.TipsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Controller
@ResponseBody
@RequestMapping("/")
@RequiredArgsConstructor
public class RandomController {

    private final TipsService tipsService;

    @GetMapping("/random/tip")
    public Mono<String> getRandomTip() {
        return tipsService.getRandomTip();
    }

    @GetMapping("/random/tips")
    public Flux<String> getRandomTip(@RequestParam Integer amount) {
        return tipsService.getRandomTips(amount);
    }


}
