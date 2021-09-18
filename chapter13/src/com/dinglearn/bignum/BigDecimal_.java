package com.dinglearn.bignum;

import java.math.BigDecimal;

/**
 * @author Ding
 * @version 1.0
 */
public class BigDecimal_ {
    public static void main(String[] args) {
        //当需要保存一个精度高的数时,double不够用
        //可以使用 BigDecimal
//        double d = 19999.1111111111111111111d;
//        System.out.println(d);

        BigDecimal bigDecimal = new BigDecimal("19999.1111111111111111111");
        BigDecimal bigDecimal1 = new BigDecimal("3");
        System.out.println(bigDecimal);

        //解读
        //1.如果对 BigDecimal进行运算,比如加减乘除,需要使用对应的方法
        //2.创建一个需要操作的BigDecimal 然后调用相应的方法即可
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(bigDecimal.multiply(bigDecimal1));
        //System.out.println(bigDecimal.divide(bigDecimal1));
        //可能抛出异常ArithmeticException
        //在调用divide 方法 ,制定精度即可 BigDecimal.ROUND_CEILING
        //如果有无线循环小数,就会保留分子精度
        System.out.println(bigDecimal.divide(bigDecimal1, BigDecimal.ROUND_CEILING));

    }
}
