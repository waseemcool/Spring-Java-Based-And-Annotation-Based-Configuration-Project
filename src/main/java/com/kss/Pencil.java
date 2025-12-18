package com.kss;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pencil implements Writer{

    public Pencil(){
        System.out.println("Pencil Constructor");
    }

    @Override
    public void write() {
        System.out.println("Writing by Pencil");
    }
}
