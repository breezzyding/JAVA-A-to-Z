package com.dinglearn.homework;

public class Manager extends Employee{
    private double grade;
    private double bonus;

    public Manager(String name, double dailyWage, int workDays, double grade, double bonus) {
        super(name, dailyWage, workDays);
        this.grade = grade;
        this.bonus = bonus;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSalary() {
        double salary = bonus + super.getDailyWage() * super.getWorkDays() * grade;
        System.out.println("您是部门经理。");
        System.out.println("您的工资是:" + salary);
    }
}
