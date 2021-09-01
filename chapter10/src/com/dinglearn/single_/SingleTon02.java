package com.dinglearn.single_;

/**
 * 演示懒汉式的单例模式
 *
 * 饿汉式 VS 懒汉式
 *
 * 1.二者最主要的区别在于创建对象的时机不同:饿汉式是在类加载就创建了对象实例
 *   而懒汉式是在使用时才创建
 * 2.饿汉式不存在线程安全问题,懒汉式存在线程安全问题
 * 3.饿汉式存在浪费资源的可能,因为如果程序员一个对象实例都没有使用,那么饿汉式
 *   创建的对象就浪费了,懒汉式是使用时才创建,就不存在这个问题.
 * 4.在我们javaSE标准类中,java.lang.Runtime就是经典的单例模式
 */
public class SingleTon02 {
    public static void main(String[] args) {

        //new Cat("大黄");
        //System.out.println(Cat.n1);//可以输出999,但并未创建对象
        Cat instance1 = Cat.getInstance();
        System.out.println(instance1);

        //再次调用getInstance
        Cat instance2 = Cat.getInstance();
        System.out.println(instance2);

        System.out.println(instance1 == instance2);//true

    }
}

//希望在程序运行过程中只能创建一个Cat对象
//使用单例模式
class Cat {
    private String name;
    public static int n1 = 999;

    private static Cat cat;

    //步骤
    //1.仍然构造器私有化
    //2.定义一个static静态属性对象
    //3.提供一个public的static方法,可以返回一个Cat对象
    //4.懒汉式,只有当用户使用getInstance()方法时,才返回Cat对象
    //  且再次调用时,会返回上次创建的cat对象,从而保证了单例
    private Cat(String name) {
        System.out.println("构造器调用");
        this.name = name;
    }

    public static Cat getInstance() {

        if (cat == null) {//如果还没有创建cat对象
            cat = new Cat("小狗");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
