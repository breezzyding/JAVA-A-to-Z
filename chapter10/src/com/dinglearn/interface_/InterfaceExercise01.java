package com.dinglearn.interface_;

public class InterfaceExercise01 {
    public static void main(String[] args) {

        B01 b = new B01();

        //语法是否正确,输出什么
        System.out.println(b.a);//23
        System.out.println(B01.a);//23
        System.out.println(A01.a);//23
    }
}

interface A01 {
    int a = 23;//public static final
}
class B01 implements A01 {

}

