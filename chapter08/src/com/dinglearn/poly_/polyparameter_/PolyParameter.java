package com.dinglearn.poly_.polyparameter_;

/*
    定义员工类Employee,包含姓名和月工资[private]
    以及计算年工资getAnnual的方法
    普通员工和经理继承了员工,经理类多了奖金bonus属性和管理manage方法
    普通员工多了work方法,普通员工和经理类要求分别重写getAnnual方法

    测试类中添加一个方法showEmployeeAnnal
    实现获取任何员工对象的年工资,并在main方法中调用该方法

    测试类中添加一个方法 testWork,如果是普通员工,则调用work方法,
    如果是经理则调用manage方法
 */
public class PolyParameter {
    public static void main(String[] args) {

        Staff ding = new Staff("ding", 5400);
        Manager zhang = new Manager("zhang", 13000, 80000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmployeeAnnal(ding);
        polyParameter.showEmployeeAnnal(zhang);

        polyParameter.testWork(ding);
        polyParameter.testWork(zhang);



    }

    //showEmployeeAnnal方法,实现获取任何员工对象的年工资
    public void showEmployeeAnnal(Employee employee) {
        System.out.println(employee.getAnnual());//动态绑定机制
    }

    //testWork方法,如果是普通员工,则调用work方法,
    //如果是经理则调用manage方法
    public void testWork(Employee employee) {
        if (employee instanceof Staff) {
            ((Staff) employee).work();//向下转型
        } else if (employee instanceof Manager) {
            ((Manager) employee).manage();//向下转型
        } else {
            System.out.println("员工信息有误...");
        }
    }



}
