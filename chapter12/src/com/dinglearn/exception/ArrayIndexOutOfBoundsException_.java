package com.dinglearn.exception;

/**
 * @author Ding
 * @version 1.0
 */
public class ArrayIndexOutOfBoundsException_ {
    public static void main(String[] args) {

        int[] arr = {1, 7, 17};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
