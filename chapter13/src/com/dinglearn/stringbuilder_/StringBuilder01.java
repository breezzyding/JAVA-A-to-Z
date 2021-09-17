package com.dinglearn.stringbuilder_;

/**
 * @author Ding
 * @version 1.0
 */
public class StringBuilder01 {
    public static void main(String[] args) {
        /*
        单线程 --> StringBuilder --> append方法 insert方法
        多线程 --> StringBuffer
         */

        //解读
        //1.StringBuilder 继承 AbstractStringBuilder类
        //2.实现了Serializable,说明StringBuilder对象是可以串行化(对象可以网络传输额,可以保存到文件)
        //3.StringBuilder是final类 不能被继承
        //4.StringBuilder对象字符序列仍然是存放在其父类 AbstractStringBuilder的 char[] value;
        //  因此,字符串序列是堆中
        //5.StringBuilder的方法,没有做互斥的处理,即没有synchronized关键字
        //  因此,在单线程的情况下,使用StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
    }
}
