package com.example.reactor.mono;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
public class MonoExample01 {

    public static void main(String[] args){
        Mono.just("Hello")
                .subscribe(
                        data -> log.info("# emitted data: {}", data)
                );
    }

}
