package com.dinglearn.homework.homewo05;

public class Teacher extends Employee{

    private int classDay;
    private int classSal;

    public Teacher(String name, int age, double salary, int classDay, int classSal) {
        super(name, age, salary);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public int getClassSal() {
        return classSal;
    }

    public void setClassSal(int classSal) {
        this.classSal = classSal;
    }

    @Override
    public void printSalary() {
        System.out.println("您是教师。");
        System.out.println("您的工资:" + (12 * getSalary() + classSal * classDay));
    }
}
