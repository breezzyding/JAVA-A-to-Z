package com.dinglearn.homework;

public class Homework06 {
    /*
     父类和子类中通过this和super都可以调用哪些属性和方法?
     */
}

class Grand {
    String name = "AA";
    private int age = 100;

    public void g1() {

    }
}

class Father extends Grand {
    String id = "001";
    private double score;

    public void f1() {
        //super可以访问哪些成员(属性和方法)?
        /*
         可以访问属性name 和 方法g1()
         */
        //this可以访问哪些成员
        /*
         可以访问属性id、score、name(父类) 和 方法f1()和g1()
         */
    }
}

class Son extends Father {
    String name = "BB";

    public void g1() {
        //super可以访问哪些成员(属性和方法)?
        /*
         可以访问属性id、name 和 方法g1()、f1()
         */
        //this可以访问哪些成员
        /*
         可以访问属性name(Son类)、id 和 g1() show() f1()
         */
    }

    private void show() {

    }
}


