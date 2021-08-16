package com.dinglearn.pkg;

//注意：
//往往需要使用到哪个类，就导入哪个类，不建议后者的导入方式
//import java.util.Scanner;   //表示只会引入java.util包下的Scanner
//import java.util.*;         //表示将java.util包下的所有类都引入

import java.util.Arrays;

public class Import01 {
    public static void main(String[] args) {

        //使用系统提供的Arrays完成 数组排序
        int[] arr = {-1, 20, 2, 13, 3};
        //传统方法是自己编写
        //系统提供实现相关功能的类，直接import即可
        Arrays.sort(arr);
        //输出排序结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

/*

 */
