package com.dinglearn.static_;

public class VisitStatic {
    public static void main(String[] args) {

        //类名.变量名
        //说明:类变量是随着类的加载而创建的,所以没有创建类对象也可以访问
        System.out.println(A.name);
        A a = new A();
        //通过对象名.类变量名
        System.out.println("a.name=" + a.name);


    }
}

class A {
    //类变量
    //类变量的访问 必须遵守 相关的访问权限
    public static String name = "xiaoding";
    //加上static称为类变量或者静态变量,否则称为实例变量/普通变量/非静态变量
    private int num = 10;
}
