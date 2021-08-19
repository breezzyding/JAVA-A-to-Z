package com.dinglearn.poly_.exercise_;

public class PolyExercise02 {
    public static void main(String[] args) {

        Sub sub = new Sub();
        System.out.println(sub.count);//20
        sub.display();//20
        Base b = sub;//向上转型
        System.out.println(b == sub);//判断的是地址--->true
        System.out.println(b.count);//属性看编译类型--->10
        b.display();//方法看运行类型--->20
    }
}

class Base {//父类
    int count = 10;
    public void display() {
        System.out.println(this.count);
    }
}

class Sub extends Base {
    int count = 20;
    public void display() {
        System.out.println(this.count);
    }
}
