package com.dinglearn.homework;

import javax.print.Doc;

/**
 * 编写Doctor类{name, age, job, gender, salary}
 * 相应的getter()和setter()方法,5个参数的构造器,重写父类的equals()方法
 * public boolean equals(Object obj),并判断测试类中创建的两个对象是否相等
 * 相等就是判断属性是否相同
 */
public class Homework10 {
    public static void main(String[] args) {

        Doctor doctor1 = new Doctor("ding", 25, "牙科医生", "男", 20000);
        Doctor doctor2 = new Doctor("ding", 25, "牙科医生", "男", 20000);

        System.out.println(doctor1.equals(doctor2));//重写了
    }
}

class Doctor {
    //属性
    private String name;
    private int age;
    private String job;
    private String gender;
    private double salary;

    public Doctor(String name, int age, String job, String gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        //判断两个比较对象是否相同
        if(this == obj) {
            return true;
        }
        //判断obj是否是Doctor类型或者其子类
        //过关斩将 校验方式
        if (!(obj instanceof Doctor)) {//不是的话
            return false;
        }

        //向下转型,因为obj的运行类型是Doctor或者其子类型
        Doctor doctor = (Doctor)obj;
        return this.name.equals(doctor.name) && this.age == doctor.age &&
                this.gender.equals(doctor.gender) && this.job.equals(doctor.job) &&
                this.salary == doctor.salary;

    }

}


