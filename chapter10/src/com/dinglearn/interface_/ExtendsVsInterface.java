package com.dinglearn.interface_;

/**
 * 接口和继承解决的问题不同
 * 继承的价值主要在于:解决代码的复用性和可维护性
 * 接口的价值主要在于:设计,设计好各种规范(方法),让其它类去实现这些方法,更灵活
 *
 * 接口比继承更加灵活
 * 接口比继承更加灵活,继承是满足 is - a 的关系,而接口只需要满足 like - a 的关系
 * 接口在一定程度上实现代码解耦(即:接口规范性 + 动态绑定)
 */
public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey goku = new LittleMonkey("Goku");
        goku.climbing();
        goku.swimming();
    }
}

//猴子
class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void climbing() {
        System.out.println(name + " 会爬树...");
    }

}

//继承
//小结:  当子类继承了父亲,就自动的拥有父类的功能
//      如果子类需要扩展功能,可以通过实现接口的方式扩展
//      可以理解成实现接口是对java单继承机制的一种补充
class LittleMonkey extends Monkey implements Fish, Bird{
    @Override
    public void swimming() {
        System.out.println(getName() + " 通过学习,可以像鱼儿一样游泳");
    }

    @Override
    public void flying() {
        System.out.println(getName() + " 通过学习,可以像鸟儿一样翱翔");
    }

    public LittleMonkey(String name) {
        super(name);
    }
}

//接口
interface Fish {
    void swimming();
}

interface Bird {
    void flying();
}