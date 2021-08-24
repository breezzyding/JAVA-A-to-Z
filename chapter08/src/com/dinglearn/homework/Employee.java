package com.dinglearn.homework;

//员工属性:姓名 单日工资 工作天数
public class Employee {
    private String name;
    private double dailyWage;
    private int workDays;

    public Employee(String name, double dailyWage, int workDays) {
        this.name = name;
        this.dailyWage = dailyWage;
        this.workDays = workDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(double dailyWage) {
        this.dailyWage = dailyWage;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    //打印工资
    public void printSalary() {
        double salary = dailyWage * workDays;
        System.out.println("您的工资是:" + salary);
    }
}
