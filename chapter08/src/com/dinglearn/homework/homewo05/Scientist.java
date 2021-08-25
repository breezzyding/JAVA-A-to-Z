package com.dinglearn.homework.homewo05;

public class Scientist extends Employee{

    private double bonus;

    public Scientist(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSalary() {
        System.out.println("您是科学家。");
        System.out.println("您的工资是:" + (12 * getSalary() + bonus));
    }
}
