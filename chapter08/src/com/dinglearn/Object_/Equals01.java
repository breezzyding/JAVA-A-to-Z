package com.dinglearn.Object_;

/**
 * == 和 equals 的对比 [面试题]
 * <p>
 * ==是一个比较运算符
 * 1.== 既可以判断基本类型,又可以判断引用类型
 * 2.== 如果判断基本类型 判断的是值是否相等
 * 3.== 如果判断引用类型 判断的是地址是否相等 即判定是不是同一个对象
 * 4.equals 是Object类中的方法 只能判断引用类型
 * 5.默认判断的是地址是否相等,子类中往往重写方法,用于判断内容是否相等
 * Integer String
 */

public class Equals01 {
    public static void main(String[] args) {

        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);//true
        System.out.println(b == c);//true
        B bObj = a;
        System.out.println(bObj == c);//true
        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);//基本数据类型,判断值是否相等

        //equals方法,源码怎么看?
        //把光标放在某方法,按Ctrl + B

        /**
         * public boolean equals(Object anObject) {
         *         if (this == anObject) {如果是用一个对象,返回true
         *             return true;
         *         }
         *         if (anObject instanceof String) {//类型是否相等
         *             String anotherString = (String)anObject;
         *             int n = value.length;
         *             if (n == anotherString.value.length) {//长度是都一致
         *                 char v1[] = value;
         *                 char v2[] = anotherString.value;
         *                 int i = 0;
         *                 while (n-- != 0) {先判断 再自减
         *                     if (v1[i] != v2[i])
         *                         return false;
         *                     i++;
         *                 }
         *                 return true;//每一位都相等,返回true
         *             }
         *         }
         *         return false;
         *
         *   }
         */

        "hello".equals("abc");

        //看看Object类里的equals

        /**
         * Object类里的equals方法默认就是比较对象地址是否想相同
         * 也就是判断两个对象是不是同一个对象
         *
         * public boolean equals(Object obj) {
         *         return (this == obj);
         *     }
         */


        /**
            Integer String
            ***判断的是地址***
            ==          判断数值    false
            equals      判断地址    true
         */
        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2);//false
        System.out.println(integer1.equals(integer2));//true

        String str1 = new String("laoWang");
        String str2 = new String("laoWang");
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true

    }


}

class B {

}

class A extends B {

}
