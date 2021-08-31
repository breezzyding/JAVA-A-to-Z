package com.dinglearn.codeblock_;

/**
 * 1)父类的静态代码块和静态属性(优先级一样,按定义顺序执行)
 * 2)子类的静态代码块和静态属性(优先级一样,按定义顺序执行)
 * 3)父类的普通代码块和普通属性初始化(优先级一样,按定义顺序执行)
 * 4)父类的构造方法
 * 5)子类的普通代码块和普通属性初始化(优先级一样,按定义顺序执行)
 * 6)子类的构造方法
 */

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        new B02();
        /*
        输出如下:
        1.getVal01
        2.A02的一个静态代码块
        3.getVal03
        4.B02的一个静态代码块
        5.A02的第一个普通代码块
        6.getVal02
        7.A02的无参构造器
        8.getVal04
        9.B02的第一个普通代码块
        10.B02的无参构造器
         */
    }
}

class A02 {//父类
    private static int n1 = getVal01();
    static {
        System.out.println("A02的一个静态代码块");
    }
    {
        System.out.println("A02的第一个普通代码块");
    }
    public int n3 = getVal02();

    public static int getVal01() {
        System.out.println("getVal01");
        return 10;
    }

    public static int getVal02() {
        System.out.println("getVal02");
        return 10;
    }

    public A02() {
        System.out.println("A02的无参构造器");
    }
}

class B02 extends A02 {//子类
    private static int n3 = getVal03();

    static {
        System.out.println("B02的一个静态代码块");
    }
    public int n5 = getVal04();
    {
        System.out.println("B02的第一个普通代码块");
    }

    public static int getVal03() {
        System.out.println("getVal03");
        return 10;
    }

    public static int getVal04() {
        System.out.println("getVal04");
        return 10;
    }

    public B02() {
        System.out.println("B02的无参构造器");
    }
}
