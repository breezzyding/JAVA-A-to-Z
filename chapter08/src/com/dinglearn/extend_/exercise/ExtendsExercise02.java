package com.dinglearn.extend_.exercise;

public class ExtendsExercise02 {

    public static void main(String[] args) {

        C02 c = new C02();

        /**
         *  输出什么内容
         *  我是A类
         *  我是B类的有参构造
         *  我是C类的有参构造
         *  我是C类的无参构造
         *
         *  注意点
         *  如果没有无参构造器 ----> 记得有隐藏的super();
         */
    }
}

class A02 {
    public A02() {
        System.out.println("我是A类");//4 ----> 5
    }
}

class B02 extends A02 {//2 ----> 3
    public B02() {
        System.out.println("我是B类的无参构造");
    }
    public B02(String name) {
        //super(); //3 ----> 4
        System.out.println(name + "我是B类的有参构造");//5 ----> 6
    }
}

class C02 extends B02 {
    public C02() {
        this("hello");//0 ----> 1
        System.out.println("我是C类的无参构造");//7 ----> 8
    }
    public C02(String name) {
        super("goodbye");//1 ----> 2
        System.out.println("我是C类的有参构造");//6 ----> 7
    }
}
