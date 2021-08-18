package com.dinglearn.super_;

public class B extends A {

    public int n1 = 888;

    //编写测试方法
    public void test() {
        /**
         * super的访问不限于直接父类,如果爷爷类和本类中有同名的成员
         * 也可以使用super去访问爷爷类的成员
         * 如果多个基类(上级类)中都有同名的成员,使用super访问遵循就近原则
         * A->B->C
         */

        System.out.println("super.n1=" + super.n1);
        super.cal();
    }

    // 访问父类的属性，但不能访问父类的private属性 案例super.属性名
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }

    public void cal() {
        System.out.println("B类的cal()方法...");
    }

    public void sum() {
        System.out.println("B类的sum()方法...");
        // 希望调用父类-A的cal方法
        // 这时,因为子类B没有cal方法,因此可以使用下面三种方式

        // 查找规则:
        // (1)先找本类,如果有,则调用
        // (2)如果没有,则着父类(如果有,并且可以调用,则调用)
        // (3)如果父类没有,则继续找父类的父类...直至Object
        // 提示:
        // 如果找到了,却无法访问,则报错   'cal()' has private access in 'com.dinglearn.super_.A'
        // 如果没找到,则提示方法不存在    Cannot resolve method 'cal' in 'B'

        // cal();

        this.cal(); // 整个逻辑和cal()是完全等价的

        // super.cal();//没有查找本类的过程,直接去父类查找

        // 演示访问属性的规则
        // n1 和 this.n1 查找规则
        // (1)先找本类,如果有,则调用
        // (2)如果没有,则着父类(如果有,并且可以调用,则调用)
        // (3)如果父类没有,则继续找父类的父类...直至Object
        // 提示:
        // 如果找到了,却无法访问,则报错
        // 如果没找到,则提示方法不存在

        System.out.println("n1=" + n1);
        System.out.println("n1=" + this.n1);

        // 直接去找父类的n1
        System.out.println("n1=" + super.n1);
    }

    // 访问父类的方法，但不能访问父类的private方法 案例super.方法名(形参列表)
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
        // super.test400();//不能访问父类的private方法
    }

    // 访问父类的构造器：super(参数列表);只能放在构造器的第一句，只能出现一句！
    public B() {
        // super();
        super("ding", 17);
        // super("ding")
    }
}
