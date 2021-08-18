package com.dinglearn.poly_;

/**
 * 多 [多种] 态 [状态]基本介绍
 * 方法或对象具有多种状态,是面向对象的第三大特征,多态是建立在封装
 * 和继承基础之上的
 * <p>
 * 多态的具体体现
 * 1.方法的多态 PolyMethod.java--重写和重载就体现多态
 * 2.对象的多态:
 *      1)一个对象的编译类型和运行类型可以不一致
 *      Animal animal = new Dog();
 *      2)编译类型在定义对象时,就确定了,不能改变
 *      3)运行类型是可以变化的
 *      4)编译类型看定义时=号的左边-----运行类型看=号的右边
 *
 */
public class PolyMethod {
    public static void main(String[] args) {

        //方法重载体现多态
        A a = new A();
        //传入不同的参数,就会调用不同的sum方法,体现多态
        System.out.println(a.sum(10, 20));
        System.out.println(a.sum(10, 20, 30));

        //方法重写体现多态
        B b = new B();
        a.say();
        b.say();


    }

}

class B {//父类

    public void say() {
        System.out.println("B say()方法被调用...");
    }
}

class A extends B {
    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    public int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public void say() {
        System.out.println("A say()方法被调用...");
    }
}
