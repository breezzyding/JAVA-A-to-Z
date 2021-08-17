package com.dinglearn.extend_;

public class ExtendsDetail {
    public static void main(String[] args) {

//        Sub sub = new Sub();//创建了子类对象sub
//        System.out.println("===第二个对象===");
//        //子类必须调用父类构造器，完成父类的初始化
//        Sub sub2 = new Sub("ding");

        System.out.println("===第三个对象===");
        Sub sub3 = new Sub("ding",17);



        //sub.sayOk();
    }
}

/**
 *  java所有的类都是Object的子类,Object是所有类的基类
 *
 *  父类构造器的调用不限于直接父类！将一直往上追溯直到Object类（顶级父类）
 *
 *  子类最多只能继承一个父亲（指直接继承），即java中是单继承机制
 *  思考：如何让A类继承B类和C类(A继承B B继承C)
 *  A -> B -> C
 *
 *  不能滥用继承 子类和父类之间必须满足is-a的关系
 *  Person is a Music？
 *  Person extends Music     不合理
 *
 *  Cat extends Animals     合理
 */
