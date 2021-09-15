package com.dinglearn.string_;

/**
 * @author Ding
 * @version 1.0
 */
public class StringExercise09 {
    public static void main(String[] args) {
        String s1 = "ding";//s1指向池中的"ding"
        String s2 = "java";//s2指向池中的"java"
        String s5 = "dingjava";//s5指向池中的"dingjava"
        String s6 = (s1 + s2).intern();//intern() --> 常量池
        System.out.println(s5 == s6);//true
        System.out.println(s5.equals(s6));//true

    }
}
