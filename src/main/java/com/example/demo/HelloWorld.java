package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld implements CommandLineRunner {
    public void run(String[] args){
        SayStuff sayStuff = new SayStuff();
    }
}
