package com.use;

import com.xiaoqiang.Dog;

public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog);//com.xiaoqiang.Dog@1b6d3586

        com.xiaoming.Dog dog1 = new com.xiaoming.Dog();
        System.out.println(dog1);//com.xiaoming.Dog@4554617c

        System.out.println(Math.abs(-1));

    }

}


/*
    包 - 命名规则
    只能包含数字 字母 下划线 小圆点 但不能用数字开头 不能是关键字或保留字
    demo.class.exec1 //错误 class是关键字
    demo.12a         //错误 12a是数字开头
    demo.ab12.0a     //对

    命名规范

    一般是小写字母+小圆点
    一般是com.公司名.项目名.业务模块名
    比如
    com.hspedu.oa.model
    com.hspedu.oa.controller
    举例
    com.sina.crm.user//用户模块
    com.sina.crm.order//订单模块
    com.sina.crm.utils//工具类



    常用的包

    java.lang.*     //lang包是基本包 默认引入 不需要再引入
    java.util.*     //util包 系统提供的工具包 工具类 使用Scanner
    java.net.*      //网络包，网络开发
    java.awt.*      //是做java的界面开发 GUI



 */



