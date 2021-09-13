package com.dinglearn.warpper;

/**
 * @author Ding
 * @version 1.0
 */
public class WrapperExercise01 {
    public static void main(String[] args) {
        /*
            1.
            下面的代码正确吗?为什么
            Double d = 100d;
            Float f = 1.5f;
            正确 jdk5之后可以自动装箱

            2.
            Object obj1 = true ? new Integer(1):new Double(2.0);
            System.out.println(obj1);//1.0 ----> 精度最高的Double!!!(三元运算符是一个整体!!!)

            3.
            Object obj2;
            if (true)
                obj2 = new integer(1);
            else
                obj2 = new Double(2.0);
            System.out.println(obj2);
            输出什么?
            1

         */
    }
}
