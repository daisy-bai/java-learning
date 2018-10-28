package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }

    @Autowired
    private Calculator calculator;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(calculator.calculate(1,"add",2));
        System.out.println(calculator.calculate(1,"jian",2));
        System.out.println(calculator.calculate(1,"cheng",2));
    }
}
