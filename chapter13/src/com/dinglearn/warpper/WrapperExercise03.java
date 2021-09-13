package com.dinglearn.warpper;

/**
 * @author Ding
 * @version 1.0
 */
public class WrapperExercise03 {
    public static void main(String[] args) {
        //输出什么?

        //示例1
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);//false ---> new

        //示例2
        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3 == i4);//false ---> new 不同的对象

        //示例3
        Integer i5 = 127;
        Integer i6 = 127;
        System.out.println(i5 == i6);//true ---> 在范围内

        //示例4
        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7 == i8);//false ---> 超出范围 需要new

        //示例5
        Integer i9 = 127;
        Integer i10 = new Integer(127);
        System.out.println(i9 == i10);//false ---> new 不同对象

        //示例6
        Integer i11 = 127;
        int i12 = 127;
        //只要有基本数据类型 判断的就是值是否相等
        System.out.println(i11 == i12);//true

        //示例7
        Integer i13 = 128;
        int i14 = 128;
        //只要有基本数据类型 判断的就是值是否相等
        System.out.println(i13 == i14);//true
    }
}
