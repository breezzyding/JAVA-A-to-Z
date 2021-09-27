package com.dinglearn.set_;


import java.util.HashSet;

/**
 * @author Ding
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        //说明
        //1.在执行add方法后,会返回一个boolean值
        //2.如果添加成功,返回true,否则返回false
        System.out.println(set.add("ding"));//true
        System.out.println(set.add("drew"));//true
        System.out.println(set.add("durant"));//true
        System.out.println(set.add("drew"));//false
        System.out.println(set.add("Ding"));//true
        set.remove("drew");
        System.out.println("set=" + set);//3个

        //
        set = new HashSet();
        System.out.println("set=" + set);//0个

        //4.HashSet不能添加相同的元素/数据?
        set.add("lucy");//添加成功
        set.add("lucy");//加入不了
        set.add(new Dog("tom"));//ok
        set.add(new Dog("tom"));//ok
        System.out.println("set=" + set);

        //在加深一下,非常经典的面试题
        //看源码,做分析
        //提问:

        //add到底发生了什么,添加机制!!!
        set.add(new String("ding"));//ok
        set.add(new String("ding"));//加入失败
        System.out.println("set=" + set);


    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}