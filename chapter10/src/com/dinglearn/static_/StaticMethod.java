package com.dinglearn.static_;

/**
 * 类方法经典的使用场景
 * 当方法中不涉及到任何和对象相关的成员,则可以将方法设计成静态方法,提高开发效率
 */
public class StaticMethod {
    public static void main(String[] args) {

        //创建2个学生对象,交学费
        Student tom = new Student("tom");
        tom.payFee(8000);
        Student john = new Student("john");
        john.payFee(8000);

        //输出当前的总学费
        Student.showFee();

        //如果试图不创建实例,也可以调用某个方法
    }
}

class Student {
    private String name;
    //定义一个静态变量,来累积学生的学费
    private static double fee = 0;

    public Student(String name) {
        this.name = name;
    }

    //说明
    //1.当方法使用static修饰后,该方法就是静态属性
    //2.静态方法就可以访问静态属性/变量
    public static void payFee(double fee) {
        Student.fee += fee;//累积
    }

    public static void showFee() {
        System.out.println("总学费=" + Student.fee);
    }
}
