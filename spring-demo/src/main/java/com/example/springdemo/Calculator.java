package com.example.springdemo;

import com.example.springdemo.operation.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Calculator {
    private final Map<String, Operation> operationMap;

    @Autowired
    public Calculator(Map<String, Operation> operationMap) {
        this.operationMap = operationMap;
    }

    public Integer calculate(Integer first, String operation, Integer second) {
        return operationMap.get(operation).cal(first, second);
    }
}