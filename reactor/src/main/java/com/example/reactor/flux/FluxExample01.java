package com.example.reactor.flux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Slf4j
public class FluxExample01 {

    public static void main(String[] arg){
        Flux.just(6, 9, 10)
                .map(num -> num % 2)
                .subscribe(remainder -> log.info("reminder: {}", remainder));
    }
}
