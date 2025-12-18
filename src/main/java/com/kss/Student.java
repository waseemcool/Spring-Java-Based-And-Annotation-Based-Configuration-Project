package com.kss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("12")
    private int rollNo;

//    @Autowired
//    @Qualifier("pencil")
    private Writer writer;

    public Student(){
        System.out.println("Student Constructor!...");
    }

    @Autowired
    public Student(@Qualifier("pencil") Writer writer) {
        this.writer = writer;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Writer getWriter() {
        return writer;
    }

//    @Autowired
//    @Qualifier("pencil")
    public void setWriter(Writer writer) {
        //System.out.println("Setter called!...");
        this.writer = writer;
    }

    public void show(){
        System.out.println("In show method");
    }

    public void writeExam(){
        writer.write();
    }

}
