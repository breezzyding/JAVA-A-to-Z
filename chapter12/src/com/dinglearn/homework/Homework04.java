package com.dinglearn.homework;

/**
 * @author Ding
 * @version 1.0
 */
public class Homework04 {
    /*
        输出什么?
        B
        C
        D

     */
    public static void main(String[] args) {
        try {
            showException();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
    }

    public static void showException() throws Exception {
        throw new Exception();
    }
}
