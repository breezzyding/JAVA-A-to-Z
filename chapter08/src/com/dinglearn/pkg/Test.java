package com.dinglearn.pkg;

import com.dinglearn.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        //在不同包下，可以访问到public修饰的属性或方法
        //但是不能访问protected 默认 private的属性或方法
        System.out.println("n1=" + a.n1);

        a.m1();
        //a.m2();a.m3();a.m4();
        //不能访问protected 默认 private的属性或方法


    }
}
