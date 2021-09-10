package com.dinglearn.exception;

/**
 * @author Ding
 * @version 1.0
 */
public class NumberFormatException_ {
    public static void main(String[] args) {

        String name = "小丁";
        //String name = "1234";
        //String 转成 int
        int num = Integer.parseInt(name);//抛出NumberFormatException
        System.out.println(num);//1234
    }
}

/*
SQLException 操作数据库时,查询表可能发生异常
IOException 操作文件时,发生异常
FileNotFoundException 当操作一个不存在的文件时,发生异常
ClassNotFoundException 加载类,而该类不存在时,异常
EOFException 操作文件,到文件末尾,发生异常
IIIegalArguementException 参数异常


 */
