package com.dinglearn.extend_;

public class Base extends TopBase{//父类是TopBase
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() {//父类无参构造器
        System.out.println("父类无参构造器Base()被调用...");
    }

    /**
     *  如果父类没有提供无参构造器，则必须在子类的构造器中用super去指定父类
     *  使用父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过
     */
    public Base(String name, int age) {//父类有参构造器
        //super();
        System.out.println("父类无参构造器Base(String name, int age)被调用...");
    }
    public Base(String name) {//父类有参构造器
        System.out.println("父类无参构造器Base(String name)被调用...");
    }


    //父类提供一个public的方法
    public int getN4() {
        return n4;
    }
    public void test100() {
        System.out.println("test100");
    }
    protected void test200() {
        System.out.println("test200");
    }
    void test300() {
        System.out.println("test300");
    }
    private void test400() {
        System.out.println("test400");
    }
    public void callTest400() {
        test400();//公共化——>在一个公共的方法(callTest400())里调用test400()方法
    }

}
