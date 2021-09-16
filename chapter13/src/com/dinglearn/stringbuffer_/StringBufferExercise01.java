package com.dinglearn.stringbuffer_;

/**
 * @author Ding
 * @version 1.0
 */
public class StringBufferExercise01 {
    public static void main(String[] args) {
        /*
         看下面的代码输出什么?
         为什么?
         */

        String str = null;
        StringBuffer sb = new StringBuffer();
        //appendNull()方法
        sb.append(str);

        System.out.println(sb.length());//4

        System.out.println(sb);//null
        //下面的构造器,会抛出空指针异常NullPointerException
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);
    }
}
