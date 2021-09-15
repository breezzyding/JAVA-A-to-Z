package com.dinglearn.string_;

/**
 * @author Ding
 * @version 1.0
 */
public class StringExercise07 {
    public static void main(String[] args) {
        String a = "hello" + "abc";
        //创建了几个对象
        //1个对象
        //解读:String a = "hello" + "abc";// ===> 优化等价 String a = "helloabc";
        //编译器会自动优化
    }
}
