package com.dinglearn.string_;

/**
 * @author Ding
 * @version 1.0
 */
public class StringMethod01 {
    public static void main(String[] args) {
        //1.equals
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));//false

        //2.equalsIgnoreCase 忽略大小写的判断内容是否相等
        String username = "john";
        if ("john".equalsIgnoreCase(username)) {
            System.out.println("Success!");
        } else {
            System.out.println("Failure!");
        }

        //3.length 获取字符的个数,字符串的长度
        System.out.println("亲密爱人".length());

        //4.indexOf 获取字符在字符串对象中第一次出现的索引
        //  索引从0开始,如果找不到,返回-1
        String s1 = "kevin@durant@163";
        int index = s1.indexOf('@');
        System.out.println(index);

        //5.lastIndexOf 获取字符字符串中最后一次出现的索引
        //  索引从0开始,如果找不到,返回-1
        String s2 = "kevin@durant@163";
        int lastIndex = s2.lastIndexOf('@');
        System.out.println(lastIndex);

        //6.substring 截取指定范围的子串
        String name = "hello,小丁";
        //name.substring(6)表表示从索引6开始截取后面所有的内容
        System.out.println(name.substring(6));//截取后面的字符
        //name.substring(0, 5)表表示从索引0开始截取,截取到索引5 - 1= 4的位置
        System.out.println(name.substring(0, 5));



    }
}
