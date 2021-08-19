package com.dinglearn.poly_.polyparameter_;

//定义员工类
public class Employee {//父类
    private String name;//姓名
    private double monthlySalary;//月薪

    //有参构造器
    public Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    //计算年薪
    public double getAnnual() {
        return 12 * monthlySalary;
    }
}
