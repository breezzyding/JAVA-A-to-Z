package com.dinglearn.override_.exercise;

public class OverrideExercise {
    public static void main(String[] args) {

        /**
         * 课堂练习
         * 1.编写一个Person类,包括属性private(name,age) 构造器
         *  方法say(返回自我介绍的字符串)
         * 2.编写一个Student类,继承Person类,增加id score属性/private
         *  以及构造器,定义say方法(返回自我介绍的信息)
         * 3.在main中,分别创建Person和Student对象 调用say方法输出自我介绍
         *
         */

        Person ding = new Person("ding", 25);
        Student justin = new Student("justin",27,"2022031144", 90.17);
        System.out.println(ding.say());
        System.out.println(justin.say());


    }

}

