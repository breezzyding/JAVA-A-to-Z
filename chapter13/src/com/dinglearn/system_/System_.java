package com.dinglearn.system_;

import java.util.Arrays;

/**
 * @author Ding
 * @version 1.0
 */
public class System_ {
    public static void main(String[] args) {

        //(1)exit 退出当前程序

//        System.out.println("ok1");
//        //解读
//        //1.exit(0)表示程序退出
//        //2.0 表示一个状态 正常的状态
//        System.exit(0);
//        System.out.println("ok2");

        //arraycopy:复制数组玩家,比较适合底层调用
        //一般使用Arrays.copyOf完成复制数组

        int[] src = {1, 2, 3};
        int[] dest = new int[3];//dest 当前是 {0, 0, 0}

        //解读
        //1.主要是搞清楚这五个参数的含义
        //2.如下

        /*
         源数组
         src – the source array.
         从源数组的哪个索引位置开始拷贝
         srcPos – starting position in the source array.
         目标数组,即把源数组的数据拷贝到哪个数组
         dest – the destination array.
         把源数组的数据拷贝到目标数组的那个索引
         destPos – starting position in the destination data.
         从源数组拷贝多少个数据到目标数组
         length – the number of array elements to be copied.
         */
        System.arraycopy(src, 0, dest, 1, src.length-1);
        //目标数组 int[] src = {1, 2, 3};
        System.out.println("dest=" + Arrays.toString(dest));//[1,2,0]

        //currentTimeMillis():返回当前时间距离1970-1-1的毫秒数
        System.out.println(System.currentTimeMillis());
    }
}
