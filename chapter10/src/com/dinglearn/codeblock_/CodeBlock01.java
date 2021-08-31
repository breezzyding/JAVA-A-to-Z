package com.dinglearn.codeblock_;


import sun.awt.windows.WPrinterJob;

/**
 * 代码块--说明注意:
 * 1)修饰符 可选 要写的话 也只能写 static
 * 2)代码块分为两类 静态代码块 非静态代码块
 * 3)逻辑语句可以为任何逻辑语句(输入 输出 方法调用 循环 判断等)
 * 4)结尾 ; 号 可以写上,也可以省略
 */
public class CodeBlock01 {
    public static void main(String[] args) {

        Movie movie1 = new Movie("失控玩家");
        Movie movie3 = new Movie("唐人街探案", 69.9 ,"陈思诚");

    }
}

class Movie {
    private String name;
    private double price;
    private String director;

    //3个构造器 ---> 重载

    //(1)下面的三个构造器都有相同的语句
    //(2)冗余
    //(3)可将相同代码封装到一个代码块中
    //(4)这样当不管调用哪个构造器,创建对象,都会先调用代码块的内容
    //(5)代码块调用的顺序优先于构造器

    {
        System.out.println("电影屏幕打开...");
        System.out.println("正在播放广告...");
        System.out.println("电影正式开始...");
    }

    public Movie(String name) {
        System.out.println("Movie(String name)被调用...");
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("Movie(String name, double price, String director)被调用...");
        this.name = name;
        this.price = price;
        this.director = director;
    }


}
