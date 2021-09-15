package com.dinglearn.string_;

/**
 * @author Ding
 * @version 1.0
 */
public class StringExercise01 {
    public static void main(String[] args) {

        String a = "abc";
        String b = "abc";
        System.out.println(a.equals(b));//true equals()方法被重写 没有new
        System.out.println(a == b);//true
    }
}
