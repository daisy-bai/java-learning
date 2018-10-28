package com.example.springdemo.operation;

import org.springframework.stereotype.Component;

@Component("jian")
public class Jian implements Operation {
    @Override
    public Integer cal(Integer first, Integer second) {
        return first - second;
    }
}
