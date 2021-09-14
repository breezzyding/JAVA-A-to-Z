package com.dinglearn.string_;



/**
 * @author Ding
 * @version 1.0
 */
public class String01 {
    public static void main(String[] args) {
        //1.String 对象用于保存字符串,也就是一组字符序列
        //2."jack"字符串常量,双引号括起的字符序列
        //3.字符串的字符使用Unicode字符编码,一个字符(不区分字母还是汉字)占两个字节
        //4.String类有很多的构造器,实现了构造器的重载
        /*
        常用的有
        String
        String s1 = new String();
        String s2 = new String(String original);
        String s3 = new String(char[] a);
        String s4 = new String(char[] a, int startIndex, int count);
        String s5 = new String(byte[] b);
        */
        //5.String类实现了接口 Serializable[String 可以串行化:可以在网络传输]
        //              接口 Comparable [String 对象可以比较大小]
        //6.String类是final 不能够被其他类继承
        //7.String有属性private final char value[];用于存放字符串内容
        //8.一定要注意:value是一个final类型,不可以修改(需要功力)
        //  即value不能指向新的地址,但是单个字符的内容是可以变化的

        String name = "jack";
        name = "tom";
        final char[] value = {'a', 'b', 'c'};
        char[] v2 = {'t', 'o', 'm'};
        value[0] = 'H';
        //value = v2;//如果把final拿掉就可以操作了-->final意在控制value不指向新的地址

    }

}
