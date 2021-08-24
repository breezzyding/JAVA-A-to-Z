package com.dinglearn.homework;

import sun.awt.windows.WPrinterJob;

/**
 * (1)要求有属性"姓名name" "年龄age" "职称post" "基本工资salary"
 * (2)编写业务方法,introduce(),实现输出一个教师的信息
 * (3)编写教师类的三个子类:教授类Professor 副教授类Associate Professor 讲师类Lecturer
 * 工资级别分别为:教授为1.3 副教授1.2 讲师类1.1
 * 在三个字类字面都重写父类的introduce()方法
 * (4)定义并初始化一个老师对象,调用业务方法,实现对象基本信息的后台打印
 */
public class Homework03 {

    public static void main(String[] args) {

        Professor professor = new Professor("ding", 45, "Professor", 300000, 1.3);
        professor.Introduction();
    }
}

class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;
    private double grade;

    public Teacher(String name, int age, String post, double salary, double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    //introduction方法 输出信息
    public void Introduction() {
        System.out.println("name:" + name + "  age:" + age +
                "  post:" + post + "  salary:" + salary + "  grade:" + grade);

    }
}

class Professor extends Teacher {
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    //introduction方法 输出信息
    public void Introduction() {
        System.out.println("这是教授的信息:");
        super.Introduction();
    }
}

class AssociateProfessor extends Teacher {
    public AssociateProfessor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    //introduction方法 输出信息
    public void Introduction() {
        System.out.println("这是副教授的信息:");
        super.Introduction();
    }
}

class Lecturer extends Teacher {
    public Lecturer(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    //introduction方法 输出信息
    public void Introduction() {
        System.out.println("这是讲师的信息:");
        super.Introduction();
    }
}
