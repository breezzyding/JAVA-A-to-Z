package com.dinglearn.final_;

/**
 * 5)一般来说,如果一个类已经是final类了,就没有必要再将方法修饰成final方法
 * 6)final不能修饰构造器
 * 7)final和static往往搭配使用,效率更高,不会导致类加载,底层编译器做了优化处理
 * 8)包装类(Integer Double Float Boolean等都是final) String也是final类
 */
public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);


    }
}

final class AAA {
    //一般来说,如果一个类已经是final类了,就没有必要再将方法修饰成final方法
    //public final void cry() { }
}

//final和static往往搭配使用,效率更高,不会导致类加载,
//底层编译器做了优化处理
class BBB {
    public final static int num = 10000;
    static {
        System.out.println("BBB静态代码块被执行");
    }
}
