package com.dinglearn.encap;

import javax.swing.*;

public class Encapsulation01 {
    public static void main(String[] args) {

        /*
        不能随便查看人的年龄，工资等隐私，并对设置的年龄进行合理的验证
        年龄合理就设置，否则给默认年龄，必须在1-120，工资不能直接查看
        name的长度在2-6字符之间
         */
        Person person = new Person();
        person.setName("ding");
        person.setAge(25);
        person.setSalary(30000);
        System.out.println(person.info());
        System.out.println(person.getSalary());

        //使用构造器
        Person smith = new Person("smith", 80, 50000);
        System.out.println("======smith的信息======");
        System.out.println(smith.info());


    }
}

class Person {

    public String name;         //名字公开
    private int age;            //年纪私有化
    private double salary;      //薪水私有化
    //private String job;         //

    //无参构造器
    public Person() {

    }

    //构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;

        //可以将set方法写在构造器中，这样仍然可以验证
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    //自己写setXxx 和 getXxx 太慢
    //使用快捷alt + insert
    //然后再完善代码
   public String getName() {
        return name;
    }

    public void setName(String name) {
       //加入对数据的校验
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字长度不正确，需要2-6字符之间，默认名字");
            this.name = "noOne";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       //判断
        if (age > 1 && age < 120) {//如果是合理范围，就赋值
            this.age = age;
        } else {
            System.out.println("你设置的年龄不对，需要在1-120之间，给默认年纪18");
            this.age = 18;//给定一个默认年纪
        }

    }

    public double getSalary() {
       //可以这里增加对当前权限的判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写一个方法，返回属性信息
    public String info() {
        return "信息为 name=" + name + " age=" + age + " salary=" + salary;
    }
}
