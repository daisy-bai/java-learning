package com.example.springdemo.operation;

import org.springframework.stereotype.Component;

@Component("cheng")
public class Cheng implements Operation {
    @Override
    public Integer cal(Integer first, Integer second) {
        return first * second;
    }
}
