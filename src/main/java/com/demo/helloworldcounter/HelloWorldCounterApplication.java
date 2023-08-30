package com.demo.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldCounterApplication {

    private static int counter = 0;

    public static String getHelloWorldMessage() {
        return "hello-world-" + counter++;
    }

    public static void main(String[] args) {
        System.out.println(getHelloWorldMessage());
    }

}
