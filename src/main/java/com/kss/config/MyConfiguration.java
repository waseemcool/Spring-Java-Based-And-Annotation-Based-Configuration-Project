package com.kss.config;

import com.kss.Pen;
import com.kss.Pencil;
import com.kss.Student;
import com.kss.Writer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.kss")
public class MyConfiguration {

    //@Bean
    //@Bean("st1")
//    public Student student(@Autowired Writer writer) {
//        // Assigning value to attributes
//        Student s = new Student();
//        s.setRollNo(37);
//        //s.setWriter(pencil());
//        s.setWriter(writer);
//        return s;
//    }

//    @Bean
//    public Student student(@Qualifier("pencil") Writer writer) {
//        // Assigning value to attributes
//        Student s = new Student();
//        s.setRollNo(37);
//        s.setWriter(writer);
//        return s;
//    }
//
//    @Bean
//    @Primary
//    public Pencil pencil(){
//        return new Pencil();
//    }
//
//    @Bean
//    @Primary
//    public Pen pen(){
//        return new Pen();
//    }
}
