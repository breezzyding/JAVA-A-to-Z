package com.dinglearn.stringbuffer_;

/**
 * @author Ding
 * @version 1.0
 */
public class StringBuffer02 {
    public static void main(String[] args) {

        //构造器的使用
        //解读
        //1.创建一个大小为 16的char[] 用于存放字符内容
        StringBuffer stringBuffer = new StringBuffer();

        //2.听过构造器制定 char[] 的大小
        StringBuffer stringBuffer1 = new StringBuffer(100);

        //3.通过给一个String创建StringBuffer
        //char数组大小 str.length + 16
        StringBuffer hello = new StringBuffer("hello");


    }
}
