package com.dinglearn.homework;

/**
 * 父类:员工类
 * 子类:部门经理 普通员工
 * 部门经理工资=1000+单日工资*天数*等级(1.2) => 奖金 + 基本工资
 * 普通员工工资=单日工资*天数*等级(1.0) => 基本工资
 * 员工属性:姓名 单日工资 工作天数
 * 员工方法 打印工资
 * 普遍员工及部门经理都是员工子类.需要重写打印工资方法
 * 定义并初始化普通员工对象,调用打印工资方法输出工资
 * 定义并初始化部门经理对象,调用打印工资方法输出工资
 */
public class Homework04 {

    public static void main(String[] args) {

        Manager ding1 = new Manager("ding", 300, 27, 1.2, 1000);
        Staff ding2 = new Staff("xiao ding", 150, 22, 1.0);
        ding1.printSalary();
        ding2.printSalary();
    }
}
