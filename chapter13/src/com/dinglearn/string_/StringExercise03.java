package com.dinglearn.string_;

import org.omg.CORBA.StringHolder;

/**
 * @author Ding
 * @version 1.0
 */
public class StringExercise03 {
    public static void main(String[] args) {
        String a = "ding";//a 指向 常量池的 "ding"
        String b = new String("ding");//b 指向队中的对象 value --> 常量池
        System.out.println(a.equals(b));//true
        System.out.println(a == b);//false
        //intern()方法
        //当调用 intern 方法时，如果池已经包含一个等于此 String 对象的字符串（用 equals(Object) 方法确定）
        //则返回池中的字符串。否则，将此 String 对象添加到池中，并返回此 String 对象的引用。
        //解读
        //(1)b.intern()方法最终返回的是常量池的地址(对象)
        System.out.println(a == b.intern());//true
        System.out.println(b == b.intern());//false
        //解读:b --> 堆 b.intern() --> 常量池
    }
}
