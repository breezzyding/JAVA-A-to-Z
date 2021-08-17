package com.dinglearn.extend_;

/**
 * 讲解继承的本质
 */
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();//内存的布局
        System.out.println(son.name);//返回就是大头儿子
        //System.out.println(son.age);//返回39
        System.out.println(son.getAge());//返回39
        System.out.println(son.hobby);//返回旅游
        //? ---> 按照查找关系 来返回信息
        //(1) 首先看子类是否有该属性
        //(2) 如果子类有这个属性，并且可以返回，则返回信息
        //(3) 如果子类没有这个属性，就看父类有没有这个属性(如果父类有该属性，并且可以访问，就返回信息)
        //(4) 如果父亲没有就按照(3)的规则，继续找上级父类，直到Object...

        /**
         * 1.加载顺序 Object -> GrandPa -> Father -> Son
         * 2.分配空间：属性->【在堆中（存放地址）】属性的值->【在常量池（堆中地址指向）中】
         *
         * 注意：
         * 如果父类中的属性是私有的，可以通过public的方法getXxx去访问
         *
         * 如果父类中的属性是私有的，不可访问，又没有方法，恰好上级父类又有可以访问的属性
         * 此时并不会跳过当前父类，去访问上级父类。
         */

    }
}

class GrandPa {//爷类
    String name = "大头爷爷";
    String hobby = "旅游";

}

class Father extends GrandPa {//父类
    String name = "大头爸爸";
    private int age = 39;

    public int getAge() {
        return age;
    }
}

class Son extends Father {//子类
    String name = "大头儿子";
}
