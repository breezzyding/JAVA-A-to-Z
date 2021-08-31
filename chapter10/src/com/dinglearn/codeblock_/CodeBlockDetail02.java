package com.dinglearn.codeblock_;

/**
 * 1.调用静态代码块和静态属性初始化(注意:静态代码块和静态属性初始化调用的优先级一样
 * 如果有多个静态代码块和多个静态变量初始化,则按他们定义的顺序调用)
 * <p>
 * 2.调用普通代码块和普通属性的初始化(注意:普通代码块和普通属性初始化调用的优先级一样
 * 如果有多个普通代码块和多个普通属性初始化,则按定义顺序调用)
 * <p>
 * 3.调用构造器
 */
public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A {

    //静态属性的初始化
    private int n2 = getN2();

    {//普通代码块
        System.out.println("A的普通代码块");
    }

    static {
        System.out.println("A 静态代码块01");
    }

    //静态属性的初始化
    private static int n1 = getN1();

    public static int getN1() {
        System.out.println("getN1被调用");//先输出这句话
        return 100;
    }

    public int getN2() {
        System.out.println("getN2被调用");//先输出这句话
        return 200;
    }

    //无参构造器
    public A() {
        System.out.println("A的无参构造器被调用");
    }
}
