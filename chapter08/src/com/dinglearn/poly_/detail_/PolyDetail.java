package com.dinglearn.poly_.detail_;

/**
 * √ 多态的前提是:两个对象(类)存在继承关系
 * √ 多态的向上转型
 * <p>
 * 1)本质:父类的引用指向了子类的对象
 * 2)语法:父类类型 引用名 = new 子类类型();
 * 3)特点:编译类型看左边 运行类型看右边
 * -------可以调用父类中的所有成员(需遵守访问权限)
 * -------不能调用子类中的特有成员
 * -------最终运行效果看子类的运行结果
 * <p>
 * <p>
 * √ 多态的向下转型
 * 1)语法:子类类型 引用名 = (子类类型) 父类引用;
 * 2)只能强转父类的引用,不能强转父类的对象
 * 3)要求父类的引用必须指向的是当前目标类型的对象
 * 4)当向下转型后,可以调用子类类型中所有的成员
 */

public class PolyDetail {
    public static void main(String[] args) {

        //向上转型--->父类的引用指向了子类的对象
        //语法:父类类型 引用名 = new 子类类型();
        Animal animal = new Cat();
        //Object obj = new Cat();//可以 不报错 Object 也是 Cat 的父类

        //向上转型调用方法的规则:
        //(1)可以调用父类中的所有成员(需遵守访问权限)
        //(2)不能调用子类中的特有成员
        //(3)因为在编译阶段,能调用哪些属性和方法,是由编译类型来决定的
        //animal.catchMouse();//错误

        //
        //(4)最终运行效果看子类的运行结果,即调用方法时,按照从子类开始查找方法
        //   然后调用,遵循方法调用规则
        animal.eat();//运行类型(子类) 看右边 Cat ---> 猫吃鱼
        animal.run();//子类 Cat ---> 父类 Animal
        animal.show();
        animal.sleep();

        //试图调用Cat的catchMouse方法
        //多态的向下转型
        //(1)语法:子类类型 引用名 = (子类类型) 父类引用;

        //提问:cat的编译类型和运行类型分别是什么?
        //回答:均是cat
        Cat cat = (Cat) animal;
        cat.catchMouse();//猫抓老鼠
        //(2)只能强转父类的引用,不能强转父类的对象
        //Dog dog = (Dog) animal;

        System.out.println("ok~~~");
    }
}