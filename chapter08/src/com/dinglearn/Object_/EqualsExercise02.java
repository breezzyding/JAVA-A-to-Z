package com.dinglearn.Object_;

public class EqualsExercise02 {
    public static void main(String[] args) {

        People p1 = new People();
        p1.name = "ding";

        People p2 = new People();
        p2.name = "ding";


        System.out.println(p1 == p2);
        //False  不指向同一个对象(== --> 是否指向同一个对象)

        System.out.println(p1.name.equals(p2.name));
        //True name属性是字符串,字符串类将equals重写了,比较的是内容

        System.out.println(p1.equals(p2));
        //false  没有重写equals方法 equals方法都来自Object
        //equals方法(Object --> 是否指向同一个对象) 同 ==


        String s1 = new String("wang");
        String s2 = new String("wang");

        System.out.println(s1.equals(s2));
        //true equals被重写 判断内容

        System.out.println(s1 == s2);
        //false 不是同一个对象


    }


}

class People {

    public String name;

}
