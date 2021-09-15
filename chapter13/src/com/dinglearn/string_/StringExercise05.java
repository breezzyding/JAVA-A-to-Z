package com.dinglearn.string_;

/**
 * @author Ding
 * @version 1.0
 */
public class StringExercise05 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "ding";
        Person p2 = new Person();
        p2.name = "ding";

        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.name == p2.name);//true
        System.out.println(p1.name == "ding");//true

        String s1 = new String("dcde");//堆
        String s2 = new String("dcde");//堆
        System.out.println(s1 == s2);//false
    }
}

class Person {
    public String name;

    public Person() {

    }
}
