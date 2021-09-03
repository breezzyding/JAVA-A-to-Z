package com.dinglearn.innerclass;

/**
 * 演示局部内部类的使用
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        //演示
        Outer01 outer01 = new Outer01();
        outer01.m1();
    }
}

class Outer01 {//外部类
    private int n1 = 100;
    private void m2() {//私有方法
        System.out.println("m2()...");
    }
    public void m1() {//方法

        //1.局部内部类是定义在外部类的局部变量.通常在方法
        //3.不能添加访问修饰符,但是可以使用final修饰
        //4.作用域:仅仅在定义它的方法体和代码块中
        final class Inner01 {//局部内部类(本质仍然是一个类)

            //2.可以直接访问外部类的所有成员,包含私有的
            private int n1 = 800;
            public void f1() {
                //5.局部内部类可以直接访问外部类的成员(属性和方法),比如下面
                //7.如果外部类和局部内部类的成员重名时,默认遵循就近原则
                //  如果想访问外部类的成员,使用(外部类名.this.成员)去访问
                //  Outer01.this 本质就是外部类的对象 即哪个对象调用了m1,Outer01.this就是那个对象
                System.out.println("就近原则的n1=" + n1);
                System.out.println("外部类的n1=" + Outer01.this.n1);
                m2();//可以访问外部类中的私有方法
            }
        }
//            class Inner02 extends Inner01 {
//                //可以继承,但是如果Inner01 加上 final 修饰符, 则不可继承
//            }
//            {//代码块
//                class Inner03 {
//
//                }


        //6.外部类在方法中,可以创建Inner01对象,然后调用方法即可
        Inner01 inner01 = new Inner01();
        inner01.f1();

    }
}

