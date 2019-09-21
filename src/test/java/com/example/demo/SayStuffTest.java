package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class SayStuffTest {

    @Test
    public void sayHelloWorld() {
        SayStuff sayStuff = new SayStuff();
        assertEquals(sayStuff.sayHelloWorld(), "Hello World");
    }
}
