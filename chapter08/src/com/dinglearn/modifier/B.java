package com.dinglearn.modifier;

public class B {
   public void say() {
       A a = new A();
       //在同一个包下，可以访问public protected 和默认的属性和方法
       //但不能访问private的属性和方法

       System.out.println("n1=" + a.n1 + " n2=" + a.n2 + " n3=" + a.n3);

       a.m1();
       a.m2();
       a.m3();
   }
}
