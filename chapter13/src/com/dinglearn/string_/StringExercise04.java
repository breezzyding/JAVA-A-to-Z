package com.dinglearn.string_;

import java.security.SecureRandom;

/**
 * @author Ding
 * @version 1.0
 */
public class StringExercise04 {
    public static void main(String[] args) {
        String s1 = "ding";//常量池
        String s2 = "java";//常量池
        String s3 = new String("java");//堆
        String s4 = "java";//常量池
        System.out.println(s2 == s3);//false
        System.out.println(s2 == s4);//true
        System.out.println(s2.equals(s3));//true
        System.out.println(s1 == s2);//false
    }
}
