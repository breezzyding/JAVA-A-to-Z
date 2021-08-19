package com.dinglearn.poly_.detail_;

public class Cat extends Animal {
    public void eat() {//方法重写
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
