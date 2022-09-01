package com.coding.DI_set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("day01.xml");
        Student student1 = (Student) app.getBean("s2");
        student1.show();
    }
}