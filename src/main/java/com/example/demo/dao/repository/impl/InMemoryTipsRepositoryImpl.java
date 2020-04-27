package com.example.demo.dao.repository.impl;

import com.example.demo.dao.repository.TipsRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Profile("in_memory")
@Repository
public class InMemoryTipsRepositoryImpl implements TipsRepository {

    private final Map<Integer, String> tips = new HashMap<>();

    @Override
    public Flux<String> getAll() {
        return Flux.fromIterable(tips.values());
    }

    @Override
    public Mono<String> get(Integer tipId) {
        return Mono.just(tips.get(tipId));
    }

    @Override
    public Mono<String> getRandom() {
        int index = (int) (Math.random() * tips.size());
        return tips.size() == 0 ? Mono.just("No tips!") : Mono.just((String) tips.values().toArray()[index]);
    }

    @Override
    public Flux<String> getRandom(Integer amount) {
        if (amount == null) amount = tips.size();
        return amount > 0 ?
                Flux.fromIterable(tips.values().stream().limit(amount).collect(Collectors.toList())) :
                Flux.empty();
    }

    @Override
    public synchronized Mono<Integer> save(String tip) {
        Integer key = tip.hashCode();
        if (tips.containsKey(key)) {
            return Mono.just(key);
        }
        tips.put(key, tip);
        return Mono.just(key);
    }

    @Override
    public synchronized Mono<Void> delete(Integer tipId) {
        return Mono.just(tips.remove(tipId)).then();
    }

}
