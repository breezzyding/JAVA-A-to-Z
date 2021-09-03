package com.dinglearn.abstract_;

/**
 * 下面三个语句是否能够编译通过?
 * 题一 abstract final class A {}     不能 final不能继承
 * 题二 abstract public static void test2();      不能 static关键字和方法无法重写
 * 题三 abstract private void test3();        不能  private的方法不能重写
 *
 *
 * 题四 编写一个Employee类,声明为抽象类,包含如下三个属性:name,id,salary
 * 提供必要的构造器和抽象方法:work()  对于Manager类来说,他即是员工,还具有奖金(bonus)的属性
 * 请使用继承的思想,设计CommonEmployee类和Manager类,要求类中提供必要的方法进行属性访问,实现work()
 * 提示"经理/普通员工 名字 工作中..."
 */
public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager ding = new Manager("ding", "1735", 10000, 1000000);
        CommonEmployee xiaoding = new CommonEmployee("xiaoding", "0506", 5000);
        ding.work();
        xiaoding.work();
    }
}

abstract class Employee {
    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}

//继承时,将子类声明为abstract类
class Manager extends Employee {

    private double bonus;

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理 " + getName() + " 工作中...");
    }
}

//继承时,重写所有方法--->即可不必声明为abstract类
class CommonEmployee extends Employee{

    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工 " + getName() + " 工作中...");
    }
}
