package com.example.springdemo;

import com.example.springdemo.operation.Add;
import com.example.springdemo.operation.Cheng;
import com.example.springdemo.operation.Jian;
import com.example.springdemo.operation.Operation;

public class OpeationFactory {
    public static Operation getOperation(String operation) {
        Operation op = null;
        switch (operation) {
            case "add":
                op = new Add();
                break;
            case "jian":
                op = new Jian();
                break;
            default:
                op = new Cheng();
                break;
        }

        return op;
    }
}
