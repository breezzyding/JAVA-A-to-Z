package com.dinglearn.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Ding
 * @version 1.0
 */
public class ArraysMethod01 {
    public static void main(String[] args) {

        Integer[] integers = {1, 20, 90};

        //遍历数组
//        for (int i = 0; i < integers.length; i++) {
//            System.out.println(integers[i]);
//        }
        //直接使用Arrays.toString方法,显示数组
//        System.out.println(Arrays.toString(integers));


        //演示 sort方法的使用

        Integer arr[] = {1, -1, 7, 0, 89};
        //进行排序
        //解读
        //1.可以直接使用冒泡排序,也可以直接使用Arrays提供的sort方法排序
        //2.因为数组是引用类型,所以通过sort排序后,会直接影响到 实参 arr
        //3.sort重载的,也可以通过传入一个接口Comparator实现定制排序
        //4.调用 定制排序 时,传入两个参数
        // (1)排序的数组 arr
        // (2)实现了Comparator接口的匿名内部类,实现compare方法
        //5.先看演示效果
        //6.体现了接口编程的方式
        //      源码分析
        // (1)Arrays.sort(arr, new Comparator() { });
        // (2)最终到 TimSort类的 private static <T> void binarySort(T[] a, int lo, int hi, int start,
        //                                       Comparator<? super T> c)

        // (3)执行到 binarySort方法代码
//        while (left < right) {
//            int mid = (left + right) >>> 1;
//            if (c.compare(pivot, a[mid]) < 0)
//                right = mid;
//            else
//                left = mid + 1;
//        }
        // (4) new Comparator() {
        //            @Override
        //            public int compare(Object o1, Object o2) {
        //                Integer i1 = (Integer) o1;
        //                Integer i2 = (Integer) o2;
        //                return i2 - i1;
        //            }
        //        }
        // (5) public int compare(Object o1, Object o2)返回的值>0 还是<0
        //          会影响整个排序





        Arrays.sort(arr);
        System.out.println("===排序后===");
        System.out.println(Arrays.toString(arr));

        //定制排序
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println("===定制排序后===");
        System.out.println(Arrays.toString(arr));


    }
}
