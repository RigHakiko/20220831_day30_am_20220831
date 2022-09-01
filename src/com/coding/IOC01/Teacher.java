package com.coding.IOC01;

import org.springframework.stereotype.Service;

@Service("tt")
public class Teacher {

    public void teach() {
        System.out.println("老师教学生读书");
    }
}
