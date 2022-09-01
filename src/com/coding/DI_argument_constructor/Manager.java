package com.coding.DI_argument_constructor;

import com.coding.DI_set.Student;

public class Manager {

    Student student = new Student();
    public Manager() {
    }
    public void work(){
        System.out.println("manager work");
    }
}
