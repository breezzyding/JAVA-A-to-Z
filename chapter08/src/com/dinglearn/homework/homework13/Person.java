package com.dinglearn.homework.homework13;

public class Person {
    //属性 name gender age
    private String name;
    private char gender;
    private int age;

    //有参构造器
    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play() {
        return name + "爱玩";
    }

    //打印基本信息
    /*
        姓名: 张飞
        年龄: 30
        性别: 男
     */
    public String basicInfo() {
        return "姓名: " + name + "\n年龄: " + age + "\n性别: " + gender;
    }
}
