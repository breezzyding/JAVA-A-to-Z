package com.dinglearn.interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {
        //1.接口不可以实例化
        //new IA();
    }
}

//2.接口中所有的方法是public,方法接口中抽象方法,可以不用abstract修饰
interface IA {
    void say();
    void hi();
}

class Cat implements IA {
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}



