package org.example.baisula.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Auther: willson2008
 * @Date: 12/02/2024 - 02 - 12 - 22:27
 * @Description: org.example.baisula.demo
 * @Version: 1.0
 */
public class HelloWorldTest {

    @Test
    public void testGetMessage() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, world!", hw.getMessage());
    }
}
