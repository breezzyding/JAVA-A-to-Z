package com.dinglearn.homework.homework13;

public class Teacher extends Person{
    //特有属性
    private int work_age;

    public Teacher(String name, char gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }

    //getter & setter
    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    //teach方法
    public void teach() {
        System.out.println("我承诺,我会认真教学");
    }

    @Override
    //重写play方法
    public String play() {
        return super.play() + "象棋";
    }

    //打印老师信息
    public void printInfo() {
        System.out.println("老师的信息");
        System.out.println(super.basicInfo());
        System.out.println("工龄: " + getWork_age());
        teach();
        System.out.println(play());
        System.out.println("--------------------");
    }
}
