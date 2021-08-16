//package的作用是声明当前类所在的包，需要放在类的最上面
// 一个类中最多只有一句package

package com.dinglearn.pkg;

//import指令 位置在package的下面 在类定义前面
//可以有多句且没有顺序要求
import java.util.Scanner;
import java.util.Arrays;

//类定义
public class PkgDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {-1, 20, 2, 13, 3};
        Arrays.sort(arr);

    }
}



