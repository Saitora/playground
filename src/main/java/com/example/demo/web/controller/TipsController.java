package com.example.demo.web.controller;


import com.example.demo.config.AppProperties;
import com.example.demo.service.TipsService;
import com.example.demo.web.controller.model.TipModel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@ResponseBody
@RequestMapping(value = "/tips")
@RequiredArgsConstructor
public class TipsController {

    private final TipsService tipsService;
    private final AppProperties appProperties;

    @GetMapping
    public Flux<String> getTips() {
        return tipsService.getTips();
    }

    @GetMapping(value = "/{tipId}")
    public Mono<String> getTip(@PathVariable Integer tipId) {
        return tipsService.getTip(tipId);
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity> addTip(@RequestBody String tip) {
        ResponseEntity.BodyBuilder ok = ResponseEntity.ok();
        return tipsService.addTip(tip)
                .map(tipId -> ok.body(TipModel.builder().id(tipId).tip(tip).build()));
    }

    @DeleteMapping(value = "/{tipId}")
    public Mono<ResponseEntity> deleteTip(@PathVariable Integer tipId) {
        return tipsService.deleteTip(tipId)
                .then(Mono.just(ResponseEntity.ok().build()));
    }

}
