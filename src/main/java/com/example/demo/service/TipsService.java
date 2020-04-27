package com.example.demo.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TipsService {

    public Mono<String> getTip(Integer tipId);

    public Flux<String> getTips();

    public Mono<String> getRandomTip();

    public Flux<String> getRandomTips(Integer amount);

    public Mono<Integer> addTip(String tip);

    public Mono<Void> deleteTip(Integer tipId);

}
