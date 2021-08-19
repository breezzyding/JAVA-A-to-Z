package com.dinglearn.poly_.polyparameter_;

//普通员工
public class Staff extends Employee{//子类
    public Staff(String name, double monthlySalary) {
        super(name, monthlySalary);
    }

    //work方法
    public void work() {
        System.out.println("普通员工" + super.getName() + "正在工作...");
    }

    //重写getAnnual方法
    @Override
    public double getAnnual() {
        System.out.print(getName() + "普通员工,您的工资是");
        return super.getAnnual();
    }
}
