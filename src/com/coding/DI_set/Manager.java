package com.coding.DI_set;

import com.coding.DI_set.Student;

public class Manager {

    Student student = new Student();
    public Manager() {
    }
    public void work(){
        System.out.println("manager work");
    }
}
