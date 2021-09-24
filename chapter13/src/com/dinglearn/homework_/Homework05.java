package com.dinglearn.homework_;

public class Homework05 {
    /*
     * 试写出一下运行结果
     */
    public static void main(String[] args) {
        String s1 = "ding";
        Animal a = new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a == b);//false --> 不是同一对象
        System.out.println(a.equals(b));//false --> equals没有重写 --> 判断是否是同一对象
        System.out.println(a.name == b.name);//true --> 比值

        String s4 = new String("ding");
        String s5 = "ding";

        //注意
        System.out.println(s1 == s4);//false --> s1指向常量池/s4指向value(堆中)
        System.out.println(s4 == s5);//false --> s1指向常量池/s4指向value(队中)

        String t1 = "hello" + s1;
        String t2 = "helloding";
        System.out.println(t1.intern() == t2);//true
    }

}

class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
}


