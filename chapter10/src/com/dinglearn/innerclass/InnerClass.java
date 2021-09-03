package com.dinglearn.innerclass;

/**
 * inner class <---> outer class
 *
 * 类的五大成员:属性 方法 构造器 代码块 内部类
 *
 * 注意:内部类是学习的难点,同时也是重点,后面看底层源码,有大量的内部类
 *
 * 内部类有 四 种:
 * 1)定义在外部类局部位置上(比如方法内) ---> 1.局部内部类(有类名) 2.匿名内部类(没有类名,重点!!!!!!!!!!!)
 * 2)定义在外部类成员位置上(属性和方法) ---> 1.成员内部类(没用static修饰) 2.静态内部类(使用static修饰)
 */
public class InnerClass {
    public static void main(String[] args) {

    }
}

class Outer {
    private int n1 = 100;//属性

    public Outer(int n1) {//构造器
        this.n1 = n1;
    }

    public void m1() {//方法
        System.out.println("m1()...");
    }
    {
        System.out.println("代码块...");
    }
    class Inner {//内部类

    }
}

