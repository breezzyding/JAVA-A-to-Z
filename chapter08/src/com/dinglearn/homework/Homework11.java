package com.dinglearn.homework;

/**
 * 现有Person类,里面有方法run,eat,Student类继承了Person类
 * 并重写了run方法,自定义了study方法,试写出对象向上转型和向下转型的代码
 * 并写出各自都可以调用哪些方法,并写出方法输出什么?
 */
public class Homework11 {
    public static void main(String[] args) {
        //向上转型
        //编译类型Person11 运行类型Student11
        //调用方法看编译类型
        Person11 person1 = new Student11();
        person1.run();//运行时,从本类开始查找
        person1.eat();//本类没有,查找父类
    /*
        可以调用父类的run()和eat()方法
        输出:
        student run
        person eat
     */

        //向下转型
        //把指向子类对象的父类引用(person1),转成指向子类对象的子类(student11)
        Student11 student11 = (Student11) person1;
        student11.study();
        student11.run();
        student11.eat();
     /*
        可以调用父类的run()和eat()方法,子类的study()方法
        输出:
        student study
        student run
        person eat
     */

    }

}

class Person11 {
    public void run() {
        System.out.println("person run");
    }

    public void eat() {
        System.out.println("person eat");
    }
}

class Student11 extends Person11 {
    public void run() {
        System.out.println("student run");
    }
    public void study() {
        System.out.println("student study");
    }
}
