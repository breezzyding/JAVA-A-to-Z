package com.dinglearn.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

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

    public static void f1() throws FileNotFoundException {
        //为什么调用f3方法 报错
        //解读
        //1.因为f3()方法抛出的是一个编译异常
        //2.即这时,就要去f1()必须处理这个编译异常
        //3.在f1()中,要么try-catch-finally 或者继续throws这个编译异常

        f3();
    }

    public static void f3() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d.//aa.txt");
    }

    public static void f4() {
        //解读
        //1.在f4()中调用f5()方法 是ok的
        //2.因为f5()抛出的是运行异常
        //3.而java中,并不要求显示处理,因为有默认处理机制
        f5();
    }
    public static void f5() throws ArithmeticException {

    }
}

class Father {//父类
    public void method() throws RuntimeException {

    }
}

class Son extends Father {//子类
    //3.子类重写父类的方法时,对抛出异常的规定:子类重写的方法
    //  所抛出的异常类型要么和父类抛出的异常一致,要么为父类抛出的异常的类型的子类型

}
