package com.example.reactor.mono;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
public class FluxExample03 {
    public static void main(String[] args){
        Flux<Object> flux =
                Mono.justOrEmpty(null) // null 값을 포함할 수 있는 오퍼레이터
                        .concatWith(Mono.justOrEmpty("Jobs"));  // mono와 mono를 합치는 오퍼레이터
        flux.subscribe(data -> log.info("result:{}", data)); // Jobs만 넘어옴.
    }
}
