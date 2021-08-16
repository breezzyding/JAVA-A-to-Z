package com.dinglearn.modifier;

public class A {

    //四个属性 分别使用不同的访问修饰符
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void m1() {
        //在同一个类中，可以访问public protected 和 默认 private 的属性和方法
        System.out.println("n1=" + n1 + " n2=" + n2 +
                " n3=" + n3 + " n4=" + n4);
    }

    //修饰符可以用来修饰类中的属性，成员方法以及类
    protected void m2() { }
    void m3() { }
    private void m4() { }
    public void hi() {
        //在同一个类中，可以访问public protected 和 默认 private 的属性和方法
        m1();
        m2();
        m3();
        m4();


    }

}
