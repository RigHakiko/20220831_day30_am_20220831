package com.coding.DI_set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCompany {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("day01.xml");
        Company company = (Company) app.getBean("company");
        company.makeMoney();
    }
}
