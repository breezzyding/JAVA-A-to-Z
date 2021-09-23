package com.dinglearn.homework_;

/**
 * @author Ding
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {

        String str = "abcdef";
        System.out.println("===交换前===");
        System.out.println(str);
        try {
            str = reverse(str,1,4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("===交换后===");
        System.out.println(str);


    }
    /**
     * (1)将字符串中指定部分进行反转,比如将"abcdef"反转为"aedcbf"
     * (2)编写方法public static String reverse(String str, int start , int end)
     *
     * 1.先把方法定义确定
     * 2.把String转成char[] 因为char[] 的元素是可以交换的
     * 3.画出分析示意图
     * 4.代码实现
     */

    public static String reverse(String str, int start, int end) {

        //对输入的参数做一个验证
        //编程思想
        //(1)写出正确的情况
        //(2)然后即可取反
        //(3)取反这样写思路清晰

        if (!(str != null && start >= 0 && end > start && end < str.length())) {
            throw new RuntimeException("参数不正确");
        }



        char[] chars = str.toCharArray();
        char temp = ' '; //交换辅助变量
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        //使用chars重新构建一个String返回即可
        return new String(chars);
    }
}
