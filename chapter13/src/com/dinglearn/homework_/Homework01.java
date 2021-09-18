package com.dinglearn.homework_;

/**
 * @author Ding
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {

    }
    /**
     * (1)将字符串中指定部分进行反转,比如将"abcdef"反转为"aedcbf"
     * (2)编写方法public static String reverse(String str, int start , int end)
     *
     * 1.先把方法定义确定
     * 2.把String转成char[] 因为char[] 的元素是可以交换的
     */

    public static String reverse(String str, int start, int end) {

        char[] chars = str.toCharArray();
        char temp = ' '; //交换辅助变量
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[i];
            chars[j] = temp;
        }

        //使用chars重新构建一个String返回即可
        return new String(chars);
    }
}
