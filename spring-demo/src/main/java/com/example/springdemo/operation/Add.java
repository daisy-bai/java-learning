package com.example.springdemo.operation;

import org.springframework.stereotype.Component;

@Component("add")
public class Add implements Operation {
    @Override
    public Integer cal(Integer first, Integer second) {
        return first + second;
    }
}
