package com.dinglearn.Object_;

public class EqualsExercise01 {
    public static void main(String[] args) {

        Person person1 = new Person("jack", 10, '男');
        Person person2 = new Person("jack", 10, '男');
        Person person3   = new Person("smith", 10, '男');

        //这个equals来自Object类
        System.out.println(person1.equals(person2));//true
        System.out.println(person1.equals(person3));//false
    }
}

//判断两个Person对象的内容是否相等
//如果两个Person对象的各个属性值都一样,则返回true,反之false

class Person {//默认 extends Object
    private String name;
    private int age;
    private char gender;

    //构造器
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //重写equals方法
    public boolean equals(Object obj) {
        //判断如果比较的两个对象是同一个对象,则直接返回true
        if(this == obj) {
            return true;
        }

        //判断类型
        if (obj instanceof Person) {//是Person 进行比较

            //进行 向下转型,比较各个属性
            Person p = (Person)obj;
            //字符串使用 equals
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        //如果不是Person,则直接返回false
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


}

