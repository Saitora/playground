package com.example.demo.service.impl;

import com.example.demo.dao.repository.TipsRepository;
import com.example.demo.service.TipsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class TipsServiceImpl implements TipsService {

    private final TipsRepository tipsRepository;

    @Override
    public Mono<String> getTip(Integer tipId) {
        return tipsRepository.get(tipId);
    }

    @Override
    public Flux<String> getTips() {
        return tipsRepository.getAll();
    }

    @Override
    public Mono<String> getRandomTip() {
        return tipsRepository.getRandom();
    }

    @Override
    public Flux<String> getRandomTips(Integer amount) {
        return tipsRepository.getRandom(amount);
    }

    @Override
    public Mono<Integer> addTip(String tip) {
        return tipsRepository.save(tip);
    }

    @Override
    public Mono<Void> deleteTip(Integer tipId) {
        return tipsRepository.delete(tipId);
    }
}
