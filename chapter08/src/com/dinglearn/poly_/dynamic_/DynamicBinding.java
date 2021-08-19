package com.dinglearn.poly_.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {

        A a = new B();
        System.out.println(a.sum());//40
        System.out.println(a.sum1());//30


        /**
         * 注释B(子类)中的sum()和sum1()方法后
         * System.out.println(a.sum());//40--->30
         * System.out.println(a.sum1());//30--->20
         * 分别输出什么?
         *
         * 1)编译类型和运行类型
         * 2)动态绑定机制!!!
         *
         */

    }
}

class A {
    public int i = 10;

    /**
     * 动态绑定规则
     *
     * 1.当调用对象方法的时候,该方法会和该对象的内存地址/运行类型绑定
     * 2.当调用对象属性的时候,没有动态绑定机制,哪里声明,哪里使用
     */
    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    public int i = 20;
//    public int sum() {
//        return i + 20;
//    }
    public int getI() {
        return i;
    }

//    public int sum1() {
//        return i + 10;
//    }
}