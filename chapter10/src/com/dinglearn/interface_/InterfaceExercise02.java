package com.dinglearn.interface_;

public class InterfaceExercise02 {
}

interface A02 {
    int x = 0;//public static final
}

class B02 {
    int x = 1;
}

class C02 extends B02 implements A02 {
    public void pX() {
        //System.out.println(x);//ambiguous--->指定不明确
        //可以明确的指定
        //访问接口的x就是用A02.x
        //访问父类的x就是用super.x
        System.out.println(A02.x + " " + super.x);
    }

    public static void main(String[] args) {
        new C02().pX();
    }
}
