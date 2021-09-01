package com.dinglearn.single_;

public class SingleTon01 {

    public static void main(String[] args) {
//       GirlFriend girl1 = new GirlFriend("小X");
//       GirlFriend girl2 = new GirlFriend("XX");

        //通过方法可以获取对象
        GirlFriend instance01 = GirlFriend.getInstance();
        System.out.println(instance01);
        GirlFriend instance02 = GirlFriend.getInstance();
        System.out.println(instance02);

        System.out.println(instance01 == instance02);//True
//        System.out.println(GirlFriend.n1);

    }
}

//有一个类,GirlFriend
//只能有一个女朋友
class GirlFriend {

    private String name;
    public static int n1 = 100;

    //为了能够在静态方法中,返回gf对象,需要将其修饰为static
    //对象通常是重量级的对象,饿汉式可能创建了对象,但并没有使用
    private static GirlFriend gf = new GirlFriend("小X");

    //如何保障只能创建一个GirlFriend对象
    //步骤
    //1.将构造器私有化
    //2.在类的内部直接创造
    //3.提供一个公共的static方法,返回gf对象
    private GirlFriend(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
