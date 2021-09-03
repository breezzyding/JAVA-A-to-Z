package com.dinglearn.abstract_;

public class AbstractDetail02 {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}

//抽象类的本质还是类,所以可以有类的各种成员
abstract class D {
    public int n1 = 10;
    public static String name = "xiaoding";
    public void hi() {
        System.out.println("hi");
    }
    public static void say() {
        System.out.println("say something");
    }
    public abstract void hello();
}

//如果一个类继承了抽象类,则它必须实现抽象类的所有抽象方法
//除非它自己也声明为abstract类
abstract class E {
    public abstract void hi();
    public abstract void say();
}

class F extends E {
    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}

abstract class G extends E {

}

//抽象方法不能使用private final static来修饰
//因为这些关键字都是和重写违背的
abstract class H {
    //private abstract void hi();
    //public final abstract void hi();
    //public static abstract void hi();
}