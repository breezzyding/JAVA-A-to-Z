package com.dinglearn.Debug01.java;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {

        int[] arr = {1, -1, 10, -20, 100};
        //看看Arrays.sort方法底层实现->Debug
        Arrays.sort(arr);//排序
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
