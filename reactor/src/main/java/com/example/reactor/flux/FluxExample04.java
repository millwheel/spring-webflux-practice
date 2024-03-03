package com.example.reactor.flux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Slf4j
public class FluxExample04 {

    // concat을 사용하면 여러 개의  Flux를 묶어서 하나의 Flux로 만들 수 있다.
    public static void main(String[] args){
        Flux.concat(
                Flux.just("Venus"),
                Flux.just("Earth"),
                Flux.just("Mars")
        ).collectList()
                .subscribe(planets -> log.info("Solar System:{}", planets));
    }
}
