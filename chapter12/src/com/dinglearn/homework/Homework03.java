package com.dinglearn.homework;

/**
 * @author Ding
 * @version 1.0
 */
public class Homework03 {
    /*
        程序输出什么
        B
        C
        D
     */
    public static void main(String[] args) {
        try {
            func();
            System.out.println("A");//不执行
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");
    }

    public static void func() {//静态方法
        try {
            throw new RuntimeException();//先执行finally
        } finally {
            System.out.println("B");
        }

    }
}
