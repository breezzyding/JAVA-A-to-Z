package com.dinglearn.string_;

/**
 * @author Ding
 * @version 1.0
 */
public class StringExercise08 {
    public static void main(String[] args) {
        String a = "hello";//创建 a 对象
        String b = "abc";//创建 b 对象
        String c = a + b;//
        //创建了几个对象?
        //三个对象
        //解读
        //1.先创建一个StringBuilder() sb = StringBuilder()
        //2.执行sb.append("hello");
        //3.再执行sb.append("abc");
        //4.String c = sb.toString();
        //最后其实c指向堆中对象(String) value[] -> 池中"helloabc"

        String d = "helloabc";
        System.out.println(c == d);//false

        String e = "hello" + "abc";//字符串常量相加,直接看常量池
        System.out.println(d == e);//true --> 优化

    }
}
