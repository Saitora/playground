package com.example.demo.dao.repository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TipsRepository {

    public default Flux<String> getAll() {
        throw new UnsupportedOperationException();
    }

    public default Mono<String> get(Integer tipId) {
        throw new UnsupportedOperationException();
    }

    public default Mono<String> getRandom() {
        throw new UnsupportedOperationException();
    }

    public default Flux<String> getRandom(Integer amount) {
        throw new UnsupportedOperationException();
    }

    public default Mono<Integer> save(String tip) {
        throw new UnsupportedOperationException();
    }

    public default Mono<Void> delete(Integer tipId) {
        throw new UnsupportedOperationException();
    }

}
