package com.dinglearn.homework;

/**
 * @author Ding
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        /*
           是否会发生异常,如果会,是哪种异常?
           如果不会,则打印结果是什么?

           ArrayIndexOutOfBoundsException
           NullPointerException
           ClassCastException

         */
        //args.length = 0
        //这里发生的是ArrayIndexOutOfBoundsException
        //还没有传入数组
        if (args[4].equals("john")) {//可能发生NullPointerException
            System.out.println("AA");
        } else {
            System.out.println("BB");
        }
        Object o = args[2];//String -> Object 向上转型
        Integer i = (Integer) o;//错误,ClassCastException
    }
}
