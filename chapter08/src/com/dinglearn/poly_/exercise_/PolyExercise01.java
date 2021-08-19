package com.dinglearn.poly_.exercise_;

public class PolyExercise01 {
    public static void main(String[] args) {

        /**
         * 请说出下面的每条语句哪些是正确的,哪些是错误的,为什么?
         *
         * double d = 13.4;                 正确
         * long l = (long) d;               正确
         * System.out.println(l);           正确 13
         *
         * int in = 5;                      正确
         * boolean b = (boolean)in;         错误 int无法转boolean
         *
         * Object obj = "Hello";            正确 向上转型
         * String objStr = (String)obj      正确 向下转型
         * System.out.println(objStr);      正确  Hello
         *
         * Object objPri = new Integer(5);  正确 向上转型
         * String str = (String)objPri;     错误 指向Integer的父类引用 转成String
         * Integer str1 = (Integer)objPri;  可以 向下转型
         */

    }
}
