package com.dinglearn.Homework;

/**
 * @author Ding
 * @version 1.0
 */
public class Homework05 {
    /*
        内部类
        1.编一个类A,在类中定义局部内部类B,B中有一个私有常量name,
          有一个方法show()打印常量name,进行测试
        2.进阶:A中也定义一个私有的变量name,在show方法中打印测试
     */
    public static void main(String[] args) {
        new A().m1();

    }
}

class A {
    private String name = "Ding";

    public void m1() {

        class B {//局部内部类
            private final String name = "ding";

            public  void show() {
                System.out.println("NAME=" + name + " 外部类的name=" + A.this.name);
            }
        }

        B b = new B();
        b.show();
    }

}
