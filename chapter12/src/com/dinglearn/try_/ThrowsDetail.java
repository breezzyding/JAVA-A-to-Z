package com.dinglearn.try_;

/**
 * @author Ding
 * @version 1.0
 */
public class ThrowsDetail {
    public static void main(String[] args) {

        f2();

    }

    public static void f2() /*throws ArithmeticExceptions*/ {
        //1.对于编译异常,程序中必须处理,比如try-catch 或者 throws
        //2.对于运行时异常,程序中如果没有处理,默认就是throws的方法处理

        int n1 = 10;
        int n2 = 0;
        double res = n1 / n2;


    }
}

class Father {//父类
    public void method() throws RuntimeException {

    }
}

class Son extends Father {//子类
    //3.子类重写父类的方法时,对抛出异常的规定:子类重写的方法
    //  所抛出的异常类型要么和父类抛出的异常一致,要么为父类抛出的异常的类型的子类型
    @Override
    public void method() throws NullPointerException {

    }
}
