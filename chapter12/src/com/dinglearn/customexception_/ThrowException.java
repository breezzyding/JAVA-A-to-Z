package com.dinglearn.customexception_;

/**
 * @author Ding
 * @version 1.0
 */
public class ThrowException {
    public static void main(String[] args) {
        try {
            ReturnExceptionDemo.methodA();
        } catch (Exception e) {//捕获methodA的抛出的异常
            System.out.println(e.getMessage());
        }
        ReturnExceptionDemo.methodB();
    }
}


class ReturnExceptionDemo {
    static void methodA() {
        try {
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常");//再抛出
        } finally {
            System.out.println("用A方法的finally");//优先执行
        }
    }

    static void methodB() {
        try {
            System.out.println("进入方法B");
            return;//不会马上执行,先执行finally
        } finally {
            System.out.println("调用B方法的finally");
        }
    }
}

/*
    输出什么?

    进入方法A
    用A方法的finally
    制造异常
    进入方法B
    调用B方法的finally
 */
