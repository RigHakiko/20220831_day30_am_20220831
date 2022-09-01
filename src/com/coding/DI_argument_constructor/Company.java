package com.coding.DI_argument_constructor;

public class Company {
    public Company() {
    }

    public Company(Manager manager, Programmer p1, Programmer p2, Programmer p3) {
        this.manager = manager;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    Manager manager;
    Programmer p1;
    Programmer p2;
    Programmer p3;


    public void makeMoney(){
        manager.work();
        p1.work();
        p2.work();
        p3.work();
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Programmer getP1() {
        return p1;
    }

    public void setP1(Programmer p1) {
        this.p1 = p1;
    }

    public Programmer getP2() {
        return p2;
    }

    public void setP2(Programmer p2) {
        this.p2 = p2;
    }

    public Programmer getP3() {
        return p3;
    }

    public void setP3(Programmer p3) {
        this.p3 = p3;
    }
}
