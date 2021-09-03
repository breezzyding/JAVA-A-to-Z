package com.dinglearn.innerclass;



/**
 * 演示匿名内部类的使用
 * <p>
 * 匿名内部类解读
 * (1)本质是类
 * (2)内部类
 * (3)该类没有名字
 * (4)同时还是一个对象!!!!!
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();


    }
}

class Outer04 {//外部类
    private int n1 = 10;//属性

    public void method() {//方法
        //基于接口的匿名内部类
        //解读
        //1.需求：使用接口IA接口,并创建对象
        //2.传统方式,是写一个类,实现该接口,并创建对象
        //3.需求更新:Tiger类只是使用一次,后面再不使用
        //4.可以使用匿名内部类来简化开发
        //5.tiger的编译类型是什么? ----> IA
        //6.tiger的运行类型是什么? ----> 就是匿名内部类 XXXX => Outer04$1
        /*
            看底层源码 会分配一个类名 Outer04$01 ---> 由电脑分配
            class XXXX implements IA {
                @Override
                public void cry() {
                    System.out.println("Soaring...");
                }
            }
         */
        //7.jdk底层在创建匿名内部类Outer04$1,立即马上就创建了Outer04$1实例
        //  并且把地址返回给tiger
        //8.匿名内部类 使用一次就不能在使用

        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("Soaring...");
            }
        };
        System.out.println("tiger的运行类型" + tiger.getClass());
        tiger.cry();

//        IA tiger = new Tiger();
//        tiger.cry();

        //演示基于类的匿名内部类
        //1. father的编译类型 Father
        //2. father的运行类型 Outer04$2(---> 带了大括号{ })
        //3. 底层会创建匿名内部类
        /*
            class Outer04$2 extends Father {
                System.out.println("匿名内部类重写了test方法");
            }
        };
         */

        //4. 同时也直接返回了 匿名内部类 Outer04$2对象
        //5. 注意("jack") 参数列表会传递给构造器
        Father father = new Father("jack") {



            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father对象的运行类型=" + father.getClass());//Outer04$2
        father.test();//


        //基于抽象类的匿名内部类
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("Gnaw bones");
            }
        };
    }
}


interface IA {//接口
    public void cry();
}

//class Tiger implements IA {
//    @Override
//    public void cry() {
//        System.out.println("Soaring...");
//    }
//}
//
//class Dog implements IA {
//    @Override
//    public void cry() {
//        System.out.println("Barking...");
//    }
//}

class Father {//类

    public Father(String name) {//构造器
        super();
        System.out.println("接受到name");
    }

    public void test() {//方法

    }
}



abstract class Animal {//抽象类
    abstract void eat();
}