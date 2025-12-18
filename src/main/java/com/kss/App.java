package com.kss;

import com.kss.config.MyConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

        Student student = context.getBean(Student.class);
        //Student student = (Student) context.getBean("st1");
        //student.show();
        //student.setRollNo(12);
        System.out.println(student.getRollNo());
        student.writeExam();
    }
}
