package com.dinglearn.codeblock_.exercise_;

public class CodeBlockExercise02 {
    public static void main(String[] args) {
        Test a = new Test();
        /*
        运行结果如下:
        静态成员sample初始化
        static执行
        普通成员sample1初始化
        Test默认构造器函数被调用
         */
    }
}

class Sample {
    public Sample(String s) {
        System.out.println(s);
    }

    public Sample() {
        System.out.println("Sample默认构造器函数被调用");
    }
}

class Test {
    Sample sample1 = new Sample("普通成员sample1初始化");
    static Sample sample = new Sample("静态成员sample初始化");
    static {
        System.out.println("static执行");
        if (sample == null) {
            System.out.println("sample is null");
        }
    }
    Test() {
        System.out.println("Test默认构造器函数被调用");
    }
}
