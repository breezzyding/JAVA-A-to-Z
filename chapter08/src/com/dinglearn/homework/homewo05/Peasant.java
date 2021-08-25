package com.dinglearn.homework.homewo05;

public class Peasant extends Employee{
    public Peasant(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void printSalary() {
        System.out.println("您是农民。");
        super.printSalary();
    }
}
