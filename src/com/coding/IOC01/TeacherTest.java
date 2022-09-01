package com.coding.IOC01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherTest {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("day01.xml");
        Teacher teacher = (Teacher) app.getBean("tt");
        System.out.println(teacher);
    }
}
