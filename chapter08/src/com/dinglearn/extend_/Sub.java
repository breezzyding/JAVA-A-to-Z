package com.dinglearn.extend_;

//按住ctrl + H 可以看到类的继承关系
public class Sub extends Base {//子类

    public Sub(String name, int age) {
        //1.调用父类的无参构造器，如下或者什么都不写（默认）
        //super();//父类的无参构造器

        //2.调用父类public Base(String name)构造器
        //super("breezy");

        //3.调用public Base(String name, int age)构造器
        super("breezy",25);
        //this("breezy",25);

        //细节：super在使用时，必须放在构造器第一行
        System.out.println("子类无参构造器Sub(String name, int age)被调用...");
        /**
         * super关键字只能在构造器中使用
         *
         * Call to 'this()' must be first statement in constructor body
         *
         * super() this()都只能放在构造器的第一行，因此这两个方法不能共存在一个构造器
         */

    }
    /**
     * There is no default constructor available in 'com.dinglearn.extend_.Base'
     */
    public Sub() {//子类无参构造器

        //super();//默认调用父类的无参构造器

        super("smith", 10);
        System.out.println("子类无参构造器Sub()被调用...");
    }
    //当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器
    public Sub(String name) {
        //do nothing
        super("kevin", 32);
        System.out.println("子类无参构造器Sub(String name)被调用...");
    }

    public void sayOk() {//
        //非private属性和方法都可以访问
        //n4 test400() 是 private
        //但是私有属性和方法无法直接访问
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
        //test400();错误

        //需要父类提供public方法去访问
        System.out.println("n4=" + getN4());;

        callTest400();
    }

}
