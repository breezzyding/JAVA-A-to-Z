package com.dinglearn.enum_;

/**
 * @author Ding
 * @version 1.0
 */
public class EnumExercise01 {
    public static void main(String[] args) {
        Gender2 boy = Gender2.BOY;
        Gender2 boy2 = Gender2.BOY;
        //本质就是调用Gender2的父类的toString()方法--->Enum
        /*
        Enum toString() 源码

        public String toString() {
            return name;
        }

         */
        System.out.println(boy);
        System.out.println(boy2 == boy);


    }
}

enum Gender2 {
    BOY, GIRL;
}
