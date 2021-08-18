package com.dinglearn.poly_;

public class Poly01 {
    public static void main(String[] args) {

        Master ding = new Master("ding");

        Dog pong = new Dog("pong");
        Bone bone = new Bone("大棒骨");

        ding.feed(pong, bone);
        System.out.println("=================");

        Cat mimi = new Cat("mimi");
        Fish croaker = new Fish("croaker");//黄花鱼

        ding.feed(mimi, croaker);
        System.out.println("=================");

        Pig hua = new Pig("hua");
        Rice wuchang = new Rice("wuchang");
        ding.feed(hua, wuchang);


    }
}
