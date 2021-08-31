package com.dinglearn.codeblock_;

/**
 * 构造器的最前面其实隐含了super()和调用普通代码块,新写一个类演示
 * 静态相关的代码块,属性初始化,在类加载时,就执行完毕,因此是优先于构造器和普通代码块执行的
 */
public class CodeBlockDetail03 {
    public static void main(String[] args) {

        new BBB();
    }
}

class AAA {
    {
        System.out.println("AAA的普通代码块");
    }
    public AAA() {//构造器
        /* 这里有隐藏的执行要求
            (1)super();         //继承
            (2)调用普通代码块的
         */
        System.out.println("AAA()构造器被调用");
    }
}

class BBB extends AAA {
    {
        System.out.println("BBB的普通代码块");
    }
    public BBB() {
        //(1)super();
        //(2)调用本类的普通代码块
        System.out.println("BBB()构造器被调用");
    }
}