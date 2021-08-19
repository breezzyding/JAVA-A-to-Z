package com.dinglearn.poly_.polyparameter_;

//经理
public class Manager extends Employee{//子类
    private double bonus;

    public Manager(String name, double monthlySalary, double bonus) {
        super(name, monthlySalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //管理方法
    public void manage() {
        System.out.println("经理" + super.getName() + "正在管理...");
    }

    //重写getAnnual方法
    @Override
    public double getAnnual() {
        System.out.print(getName() + "经理,您的工资是");
        return super.getAnnual() + bonus;
    }
}
