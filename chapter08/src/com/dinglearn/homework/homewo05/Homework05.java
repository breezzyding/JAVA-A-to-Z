package com.dinglearn.homework.homewo05;

/**
 * 设计父类一员工类,子类:工人类(Worker)农民类(Peasant)
 * 教师类(Teacher)科学家类(Scientist)服务生类(Waiter)
 * 1.其中工人、农名、服务生只有基本工资salary
 * 2.教师除基本工资外,还有课酬(元/天)classDay classSalary
 * 3.科学家除基本工资外,还有年终奖bonus
 * 4.编写一个测试类,将各种类型的员工的全年工资打印出来
 */
public class Homework05 {

    public static void main(String[] args) {

        Test test = new Test();

        test.printAll();
    }
}
