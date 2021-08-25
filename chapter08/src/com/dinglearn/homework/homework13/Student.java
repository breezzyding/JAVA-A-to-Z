package com.dinglearn.homework.homework13;

public class Student extends Person{
    //特有属性
    private String stu_id;

    //构造器
    public Student(String name, char gender, int age, String stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    //getter & setter
    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    //study方法
    public void study() {
        System.out.println("我承诺,我会好好学习");
    }

    @Override
    //重写play方法
    public String play(){
        return super.play() + "足球";
    }

    //打印学生信息
    public void printInfo() {
        System.out.println("学生的信息");
        System.out.println(super.basicInfo());;
        System.out.println("学号: " + getStu_id());
        study();
        System.out.println(play());
        System.out.println("--------------------");
    }
}
