package com.dinglearn.super_;

public class Super01 {
    public static void main(String[] args) {

        B b = new B();
        // b.sum();
        b.test();
    }
}

/**
 *   No.    区别点            this                     super
 *   1      访问属性     访问本类中的属性,如果本类      从父类开始查找属性
 *                      没有此属性则从父类中继续
 *                      查找
 *   2      调用方法     访问本类中的方法,如果本类      直接从父类开始查找方法
 *                      没有此方法则从父类中继续
 *                      查找
 *   3      调用构造器   调用本类构造器,必须放在        调用父类构造器,必须
 *                      构造器的首行                 放在子类构造器的首行
 *   4      特殊        表示当前对象                 子类中访问父类对象
 */
