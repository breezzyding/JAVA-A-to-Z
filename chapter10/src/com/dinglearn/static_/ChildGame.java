package com.dinglearn.static_;

public class ChildGame {
    public static void main(String[] args) {

        //定义一个变量count,统计有多少个小孩加入了游戏
        int count = 0;

        Child child1 = new Child("小丁");
        child1.join();
        //count++;
        child1.count++;

        Child child2 = new Child("老丁");
        child2.join();
        //count++;
        child2.count++;

        Child child3 = new Child("笨蛋小丁");
        child3.join();
        //count++;
        child3.count++;

        //游戏结束

        //类变量,可以通过类名来访问
        System.out.println("共有 " + Child.count + " 小孩加入了游戏...");

        //下面的代码输出什么?
        //静态变量被同一个类的所有对象共享
        System.out.println("child1.count=" + child1.count);
        System.out.println("child2.count=" + child2.count);
        System.out.println("child3.count=" + child3.count);
    }
}

class Child {
    private String name;
    //定义一个变量count 是一个类变量(静态变量) static 静态
    //该变量最大的特点就是会被Child类的所有对象实例共享
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + " 加入了游戏...");
    }
}
