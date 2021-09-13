package com.dinglearn.warpper;

/**
 * @author Ding
 * @version 1.0
 */
public class WrapperExercise02 {
    public static void main(String[] args) {

        /*
            经典面试题
         */
        Integer i = new Integer(1);//new
        Integer j = new Integer(1);//new
        System.out.println(i == j);//判断是否是同一个对象? ---> false

        //这里主要看范围 -128~127 就是直接返回 --> 并没有创建新的对象
        /**
         * public static Integer valueOf(int i) {
         *      if (i >= IntegerCache.low && i <= IntegerCache.high)
         *             return IntegerCache.cache[i + (-IntegerCache.low)];
         *         return new Integer(i);
         * }
         */
        Integer m = 1;//底层用的Integer.valueOf(1) ---> 阅读源码
        Integer n = 1;//底层用的Integer.valueOf(1)
        System.out.println(m == n);//true

        Integer x = 128;//超出范围
        Integer y = 128;
        System.out.println(x == y);//false
    }

    //输出结果是什么?
    //false
    //true
    //false
}
