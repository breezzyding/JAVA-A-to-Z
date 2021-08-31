package com.dinglearn.main_;


/**
 * 深入理解main方法
 * public static void main(String[] args) { }
 *
 * 1.main方法是虚拟机调用
 * 2.java虚拟机需要调用类的main()方法,所有该方法的访问权限必须是public
 * 3.java虚拟机在执行main()方法时不必创建对象,所以该方法必须是static
 * 4.该方法接受String类型的数组参数,该数组中保存执行java命令时传递给所运行的类的参数
 * 5.java执行的程序 参数1 参数2 参数3
 *
 * 特别注意:
 * 1.在main()方法中,可以直接调用main方法所在类的静态方法或静态属性
 * 2.但不能直接访问该类中的非静态成员,必须创建该类的一个实例对象后,才能通过这个对象去访问同类中的非静态成员
 */
public class Main01 {

    //静态的变量/属性
    private static String name = "xiaoding";
    //非静态的变量/属性
    private int n1 = 100;

    //静态方法
    public static void hi() {
        System.out.println("Main01的hi()方法");
    }

    //非静态方法
    public void say() {
        System.out.println("Main01的say()方法");
    }


    public static void main(String[] args) {

        //可以直接使用name
        //1.静态方法main方法,可以访问本类的静态方法或静态属性
        System.out.println("name=" + name);
        hi();

        //2.静态方法main方法,不可访问本类的非静态方法或静态属性

        //System.out.println("n1=" + n1);   错误
        //say();                            错误

        //3.必须创建该类的一个实例对象后
        //  才能通过这个对象去访问同类中的非静态成员
        Main01 main01 = new Main01();
        System.out.println(main01.n1);
        main01.say();
    }
}
