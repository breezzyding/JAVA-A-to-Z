package com.dinglearn.final_;

public class Final01 {
    public static void main(String[] args) {
        E e = new E();

        //无法修改
        //e.TAX_RATE = 0.09;


    }
}

//如果我们要求A类不能被其他类继承
//可以使用final修饰A类
final class A { }

//class B extends A{ }

class C {
    //如果要求hi()方法不能被子类重写
    //可以使用final修饰hi()方法
    public final void hi() {}
}

class D extends C {
//    @Override
//    public void hi() {
//        System.out.println("重写了C类的hi()方法");
//    }
}

class E {
    public final double TAX_RATE = 0.08;
}

//当不希望某个局部变量被修改,可以使用final修饰
class F {
    public void cry() {
        //NUM 也称为 局部常量
        final double NUM = 0.01;
        //NUM = 0.9;
        System.out.println("NUM=" + NUM);
    }
}

