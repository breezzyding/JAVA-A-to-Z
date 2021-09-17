package com.dinglearn.stringbuilder_;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author Ding
 * @version 1.0
 */
public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {
        /*
        效率: StringBuilder > StringBuffer > String

        使用原则[结论]:
        1.如果字符串存在大量的修改操作,一般使用StringBuffer或StringBuilder
        2.如果字符串存在大量的修改操作,并在单线程的情况,使用StringBuilder
        3.如果字符串存在大量的修改操作,并在多线程的情况,使用StringBuffer
        4.如果我们字符串很少修改,被多个对象引用,使用String,比如配置信息等

         */

        long  startTime = 0L;
        long  endTime = 0L;
        StringBuffer buffer = new StringBuffer("");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {//StringBuffer 拼接八万次
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间: " + (endTime - startTime));



        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间: " + (endTime - startTime));

        String text = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {//String 拼接 八万次
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间: " + (endTime - startTime));


    }
}
