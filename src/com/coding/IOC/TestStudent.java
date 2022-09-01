package com.coding.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("day01.xml");
        Student s1 = (Student) app.getBean("s1");
        System.out.println(s1);
    }
}
