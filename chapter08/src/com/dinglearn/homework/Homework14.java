package com.dinglearn.homework;

public class Homework14 {
    public static void main(String[] args) {

        C c = new C();
        /*
         * 输出什么内：
         *
         * 1.我是A类
         * 2.我是B类的无参构造器
         * 3.hahaha我是B类的有参构造器
         * 4.我是C类的有参构造器
         * 5.我是C类的无参构造器
         *
         * 提示:
         * 要留意有参构造器中的隐藏的super();
         */
    }
}

class A {
    public A() {
        System.out.println("我是A类");
    }
}

class B extends A {
    public B() {
        System.out.println("我是B类的无参构造器");
    }

    public B(String name) {
        //super();
        System.out.println(name + "我是B类的有参构造器");
    }
}

class C extends B {
    public C() {
        this("hello");
        System.out.println("我是C类的无参构造器");
    }

    public C(String name) {
        super("hahaha");
        System.out.println("我是C类的有参构造器");
    }
}