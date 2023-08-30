package com.demo.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = HelloWorldCounterApplication.class)
public class HelloWorldCounterApplicationTests {

    @Autowired
    private HelloWorldCounterApplication helloWorldCounterApplication;

    @Test
    public void contextLoads() {
        assertNotNull(helloWorldCounterApplication);
    }

    @Test
    public void testHelloWorldMessage() {
        String message = helloWorldCounterApplication.getHelloWorldMessage();
        assertNotNull(message);
        assertTrue(message.startsWith("hello-world-"));
    }
}
