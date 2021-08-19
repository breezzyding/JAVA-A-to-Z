package com.dinglearn.poly_.polyarr_;

public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //重写父类
    @Override
    public String say() {
        return "学生 " + super.say() + "\tscore=" + score;
    }

    public void learn() {
        System.out.println("学生 " + getName() + " 正在听课。");
    }
}
