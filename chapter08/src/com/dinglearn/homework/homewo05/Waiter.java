package com.dinglearn.homework.homewo05;

public class Waiter extends Employee{
    public Waiter(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void printSalary() {
        System.out.println("您是服务生。");
        super.printSalary();
    }
}
