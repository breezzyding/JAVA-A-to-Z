package com.dinglearn.bignum;

import java.math.BigInteger;

/**
 * @author Ding
 * @version 1.0
 */
public class BigInteger_ {
    public static void main(String[] args) {

        //当我们编程中,需要处理很大的整数,long不够用
        //可以使用BigInteger的类来搞定
//        long l = 24788889999999999999999l;
//        System.out.println("l=" + l);

        BigInteger bigInteger = new BigInteger("24788889999999999999999");
        BigInteger bigInteger2 = new BigInteger("100");
        System.out.println(bigInteger);
        //解读
        //1.在对 BigInteger 进行加减乘除的时候,需要使用对应的方法,不能直接进行 + - * /
        //2.可以创建一个 要操作的 BigInteger 然后进行相应操作
        BigInteger add = bigInteger.add(bigInteger2);
        System.out.println(add);
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        System.out.println(subtract);
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        System.out.println(multiply);
        BigInteger divide = bigInteger.divide(bigInteger2);
        System.out.println(divide);
    }
}
