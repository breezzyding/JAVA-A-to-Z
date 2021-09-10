package com.dinglearn.try_;

import java.util.Scanner;

/**
 * @author Ding
 * @version 1.0
 */
public class TryCatchExercise04 {
    /*
    需求:如果用户输入的不是一个整数,就提示他反复输入,直到输入一个整数为止
    1.创建Scanner对象
    2.使用无限循环,去接受一个输入
    3.然后将该输入的值转成int类型
    4.如果在转换时,抛出异常,说明输入的内容不是一个可以转成int的内容
    5.如果没有抛出异常,则break该循环
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";
        while (true) {
            System.out.print("请输入一个整数:");
            inputStr = myScanner.next();
            try {
                num = Integer.parseInt(inputStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入有误,请重新输入。");
            }
        }
        System.out.println("输入无误,您输入的整数为:" + num);

    }
}
