package com.dinglearn.poly_.polyarr_;

import com.sun.corba.se.impl.orb.ParserTable;

public class PolyArray {
    public static void main(String[] args) {

        /**
         *  应用实例:现有一个继承结构如下:要求创建1个Person对象
         *  2个Student对象和2个Teacher对象 统一放在数组里面
         *  并调用每个对象say方法
         */

        Person[] persons = new Person[5];
        persons[0] = new Person("ding", 17);
        persons[1] = new Student("ding", 17, 100);
        persons[2] = new Student("Ding", 25, 60);
        persons[3] = new Teacher("gong", 32, 20000);
        persons[4] = new Teacher("laoDing", 55, 60000);

        //循环遍历多态数组,调用say方法
        for (int i = 0; i < persons.length; i++) {
            /*
                person[i] 编译类型是 Person
                运行类型是根据实际情况由JVM虚拟机来判断
             */
            System.out.println(persons[i].say());//动态绑定机制

            //使用 类型判断 + 向下转移
            if (persons[i] instanceof Student) {//是学生吗?
                //向下转型
                ((Student)persons[i]).learn();
            } else if (persons[i] instanceof Teacher) {//是老师吗?
                //向下转型
                ((Teacher)persons[i]).teach();
            } else if (persons[i] instanceof Person) {
                System.out.println();
            } else {
                System.out.println("类型有误");
            }

        }



    }
}
