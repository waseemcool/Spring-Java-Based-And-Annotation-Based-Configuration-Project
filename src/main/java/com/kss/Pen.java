package com.kss;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pen implements Writer{

    public Pen() {
        System.out.println("Pen Constructor");
    }

    @Override
    public void write() {
        System.out.println("Writing by Pen");
    }
}
