package com.dinglearn.static_;

/**
 * 1.当需要让某个类的所有对象都共享一个变量时,就可以考虑使用类变量
 * 2.类变量是该类的所有对象共享的,而实例变量是每个对象独享的
 * 3.加上static称为类变量或者静态变量,否则称为实例变量/普通变量/非静态变量
 * 4.类变量可以通过 类名.类变量名 或者 对象名.类变量名 来访问 建议使用前者!!!
 * 5.实例变量不能通过 类名.类变量名 方式访问
 * 6.类变量实在类加载时就初始化了,也就是说,即使你没有创建对象,只要类加载了,就可以使用类变量
 * 7.类变量的生命周期是随类的加载开始,随着类相忘而销毁
 */
public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();
        //System.out.println(B.n1);
        System.out.println(B.n2);

        //静态变量是类加载的时候,就创建了
        //即使你没有创建对象,只要类加载了,就可以使用类变量
        //可以通过类名.类变量名 方式访问
        System.out.println(C.address);

    }
}

class B {
    public int n1 = 100;
    public static int n2 = 200;
}

class C {
    public static String address = "北京";
}
