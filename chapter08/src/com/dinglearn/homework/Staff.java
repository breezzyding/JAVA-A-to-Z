package com.dinglearn.homework;

public class Staff extends Employee{
    private double grade;

    public Staff(String name, double dailyWage, int workDays, double grade) {
        super(name, dailyWage, workDays);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public void printSalary() {
        double salary = super.getDailyWage() * super.getWorkDays() * grade;
        System.out.println("您是普通员工。");
        System.out.println("您的工资是:" + salary);
    }
}
