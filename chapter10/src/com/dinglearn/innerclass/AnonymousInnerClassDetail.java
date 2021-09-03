package com.dinglearn.innerclass;

/**
 *
 */
public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();

        //外部其他类---不能访问---匿名内部类
        System.out.println("main outer05 hashcode=" + outer05.hashCode());
    }
}

class Outer05 {
    private int n1 = 99;
    public void f1() {
        //创建一个基于类的匿名内部类
        //不能添加访问修饰符
        //作用域:仅仅在定义它的方法或代码块中
        Person p = new Person() {
            private int n1 = 88;//就近原则

            @Override
            public void hi() {
                //可以直接访问外部类的所有成员,包含私有的
                //如果外部类和匿名内部类的成员重名时,匿名内部类访问的话
                //默认遵循就近原则,如果想访问外部类的成员,则可以使用(外部类名.this.成员)去访问
                System.out.println("匿名内部类重写了hi()方法 n1= " + n1 +
                        " 外部内的n1=" + Outer05.this.n1);
                //Outer05.this就是调用f1()的对象
                System.out.println("Outer05.this hashcode=" + Outer05.this.hashCode());

            }

        };
        p.hi();//动态绑定 运行类型是 Outer05$1

        //也可以直接调用,匿名内部类本身也是返回对象那个
        /*
            class 匿名内部类 extends Person { }
         */
        new Person() {
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi()方法,hahahahahaha");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("ding");
    }
}

class Person {
    public void hi() {
        System.out.println("Person hi()");
    }
    public void ok(String str) {
        System.out.println("Person ok() " + str);
    }
}

//抽象类 接口


