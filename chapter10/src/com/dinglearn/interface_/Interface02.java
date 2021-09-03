package com.dinglearn.interface_;

public class Interface02 {
    public static void main(String[] args) {


    }
}

//1.如果一个类 implements实现 接口
//2.需要将该接口的所有抽象方法都实现
class A implements AInterface {
    @Override
    public void hi() {
        System.out.println();
    }
}

