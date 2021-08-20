package com.dinglearn.Object_;

public class EqualsExercise03 {
    public static void main(String[] args) {

        int in = 65;
        float fl = 65.0f;
        System.out.println("65和65.0f是否相等? " + (in == fl));//true
        //没有重写 == 比较数值

        char ch1 = 'A';
        char ch2 = 12;
        System.out.println("65和'A'是否相等? " + (in == ch1));//true
        System.out.println("12和ch2是否相等? " + (12 == ch2));//true

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("str1和str2是否相等? " + (str1 == str2));//false

        System.out.println("str1是否equals str2?" + (str1.equals(str2)));//true
        //System.out.println("hello" == new java.sql.Date());//报错
    }
}
