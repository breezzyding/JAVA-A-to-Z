package com.dinglearn.poly_.objpoly_;

public class PolyObject {
    public static void main(String[] args) {

        //体验对象多态特点

        //animal 编译类型就是 Animal 运行类型 Dog
        Animal animal = new Dog();

        //执行到此条语句时,animal的运行类型是Dog
        //故这个cry()就是Dog类里的cry()方法
        animal.cry();//Dog cry() 小狗汪汪汪

        //animal 编译类型就是 Animal 运行类型 Cat
        animal = new Cat();
        animal.cry();//Cat cry() 小猫喵喵喵

    }
}
