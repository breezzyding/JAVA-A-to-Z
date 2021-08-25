package com.dinglearn.homework.homewo05;

//测试类,打印各种类型的员工的全年工资
public class Test {
    public void printAll() {
        Worker ding1 = new Worker("ding", 17, 2000);
        Peasant xiao_ding1 = new Peasant("xiao ding", 17, 800);
        Waiter ding2 = new Waiter("Ding", 22, 1500);
        Teacher xiao_ding2 = new Teacher("xiao Ding", 20, 2200, 10,35);
        Scientist lao_ding = new Scientist("lao ding", 45, 5000, 100000);
        ding1.printSalary();
        xiao_ding1.printSalary();
        ding2.printSalary();
        xiao_ding2.printSalary();
        lao_ding.printSalary();
    }
}
