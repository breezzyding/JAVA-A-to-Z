package com.dinglearn.homework.homewo05;

public class Worker extends Employee{
    public Worker(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void printSalary() {
        System.out.println("您是工人。");
        super.printSalary();
    }
}
