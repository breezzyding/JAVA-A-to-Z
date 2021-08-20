package com.dinglearn.Object_;

import javax.lang.model.element.NestingKind;

public class ToString_ {
    public static void main(String[] args) {

        /*
        Object的toString() 源码
        (1)getClass().getName()类的全类名(包名+类名)
        (2)Integer.toHexString(hashCode()将对象的hashCode值转成16进制字符串
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
         */

        Monster monster = new Monster("小妖怪", "巡山", 1000);
        System.out.println(monster.toString() + " hashCode=" + monster.hashCode());

        System.out.println("===当直接输出一个对象时,toString方法会被默认调用===");
        System.out.println(monster);
    }
}

class Monster {
    private String name;
    private String job;
    private double salary;

    public Monster(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //重写toString方法,输出对象

    @Override
    public String toString() {//重写后,一般是把对象的属性值输出,也可以自定义
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}
