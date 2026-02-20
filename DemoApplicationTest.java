package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DemoApplicationTest {

    @Test
    void testHelloMessage() {
        String message = "Hello CI/CD!";
        assertEquals("Hello CI/CD!", message);
    }
}
