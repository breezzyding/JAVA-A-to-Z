package com.dinglearn.innerclass;

/**
 * 小结
 * (1)内部类有四种 [局部内部类 匿名内部类] [成员内部类 静态内部类]
 * (2)重点掌握匿名内部类的使用 new 类/接口(参数列表) = {//... };
 * (3)成员内部类 静态内部类 是放在外部类的成员位置,本质就是一个成员
 */
public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();

        //外部其他类,使用静态内部类
        //方式1
        //因为静态内部类是可以通过类名直接访问(前提是满足访问权限)
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();

        //方式2
        //编写一个方法,可以返回静态内部类的对象实例
        Outer10.Inner10 inner101 = outer10.getInner10();
        System.out.println("——————————————————");
        inner101.say();

        //方式3
        Outer10.Inner10 inner10_ = Outer10.getInner10_();
        System.out.println("******************");
        inner10_.say();

    }
}

class Outer10 {//外部类
    private int n1 = 10;
    private static String name = "张三";
    private static void cry() { }
    //Inner10就是静态内部类
    //1.放在外部类的成员位置
    //2.使用static修饰
    //3.可以直接访问外部类的所有静态成员,包含私有的,但不能直接访问非静态成员
    //4.可以添加任意访问修饰符(public protected 默认 private)因为他的地位就是一个成员
    //5.作用域:同其他的成员,为整个类体
    static class Inner10 {
        private static String name = "小丁";
        public void say() {
            //System.out.println(n1);
            //如果外部类和静态内部类的成员重名时,静态内部类访问时,默认遵循就近原则
            //如果想访问外部类的成员,则可以 ---> 外部类名.成员
            System.out.println(name + " 外部类name=" + Inner10.name);
        }
    }

    public void m1() {
        Inner10 inner10 = new Inner10();
        inner10.say();
    }

    public Inner10 getInner10() {
        return new Inner10();
    }

    public static Inner10 getInner10_() {
        return new Inner10();
    }
}


/*
课堂测试
判断输出结果:
5
5

测试 ----> InnerClassExercise.java



public class Test{//外部类
    public Test() {//构造器
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        System.out.println(s2.a);//5
    }
    class Inner {//内部类,成员内部类
        public int a = 5;
    }

    public static void main(String[] args) {
        Test t = new Test();//----> 执行构造器
        Inner r = t.new Inner();
        System.out.println(r.a);//5
    }
}
 */