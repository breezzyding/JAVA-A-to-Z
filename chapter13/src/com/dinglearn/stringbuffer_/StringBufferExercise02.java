package com.dinglearn.stringbuffer_;

import java.util.Scanner;

/**
 * @author Ding
 * @version 1.0

 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        /*
        输入商品名称和商品价格,要求打印效果示例,使用前面学习的方法完成
        商品名 商品价格
        手机   5,888
        价格的小数点前面每三位用逗号隔开

        1.定义一个Scanner对象,接受用户输入的价格(String)
        2.希望可以使用到StringBuffer的 insert 需要将String 转成 StringBuffer
        3.然后使用相关方法进行字符串的处理
        代码实现
         */

        Scanner scanner = new Scanner(System.in);
        String price = "5888.88";
        StringBuffer sb = new StringBuffer(price);

        //先完成一个最简单的实现5,888.88
        //找到小数点的索引,然后在该位置的前三位,插入,即可

//        int i = sb.lastIndexOf(".");
//        sb.insert(i - 3, ",");
//        System.out.println(sb);//"5,888.88"

        //上面的代码需要加入循环控制
        for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
            sb = sb.insert(i, ",");
        }
        System.out.println(sb);//"5,888.88"




    }

}
