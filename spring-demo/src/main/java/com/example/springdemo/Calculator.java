package com.example.springdemo;

public class Calculator {
    public Integer calculate(Integer first, String operation, Integer second) {
        return OpeationFactory.getOperation(operation).cal(first,second);
    }
}