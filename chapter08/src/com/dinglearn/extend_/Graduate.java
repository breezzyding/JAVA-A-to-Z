package com.dinglearn.extend_;
//大学生类->模拟大学生考试情况

/**
 * 使用继承来提高代码复用性
 */
public class Graduate {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void testing() {
        System.out.println("大学生 " + name + "正在考高等数学...");
    }
    public void showInfo() {
        System.out.println("大学生名字 " + name + " 年龄 " + age + " 成绩 " + score);
    }
}
