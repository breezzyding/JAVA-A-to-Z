package com.dinglearn.homework;

import javax.lang.model.element.NestingKind;

public class Homework07 {
        /*
        写出程序结果

        Test
        Demo
        Rose
        Jack
        John
        Jack


         */

}

class Test {
    String name = "Rose";
    Test() {
        System.out.println("Test");//(1)
    }
    Test(String name){//name John
        this.name = name;//父类的name修改成了John
    }
}

class Demo extends Test {
    String name = "Jack";
    Demo() {//无参构造器---->去父类找 Test
        super();
        System.out.println("Demo");//(2)
    }
    Demo(String s) {
        super(s);
    }
    public void test() {
        System.out.println(super.name);//(3)Rose    //(5)John
        System.out.println(this.name);//(4)Jack     //(6)Jack
    }

    public static void main(String[] args) {
        new Demo().test();
        new Demo("John").test();
    }


}
