package com.dinglearn.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Ding
 * @version 1.0
 */
public class CollectionExercise {
    /*
     * 1.创建3个Dog{name, age}对象,放入到ArrayList中,赋给List引用
     * 2.用迭代器和增强for循环两种方式来遍历
     * 3.重写Dog的toString方法,输出name和age
     */
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("xiaoding", 7));
        list.add(new Dog("xiaoDing", 17));
        list.add(new Dog("dogflower", 24));

        //迭代器 itit
        System.out.println("===itit(迭代器)===");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj=" + obj);
        }

        //增强for
        System.out.println("===增强for===");
        for(Object dog : list) {
            System.out.println("dog=" + dog);
        }
    }

}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}