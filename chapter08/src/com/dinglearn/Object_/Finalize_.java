package com.dinglearn.Object_;

public class Finalize_ {
    public static void main(String[] args) {

        Car bmw = new Car("宝马");

        //此时car对象就是一个垃圾,垃圾回收器就会回收(销毁)对象
        //在销毁对象前,会调用该对象的finalize方法
        //程序员就可以在finalize中,写自己的业务逻辑代码
        //如释放资源,数据库连接,或者打开文件...
        //如程序员不重写finalize方法,就会调用Object类的finalize,即默认处理
        bmw = null;

        System.gc();//主动调用垃圾回收器

        System.out.println("程序退出了...");
        /*
            输出:
            程序退出了...
            销毁汽车宝马
            释放了某些资源...

            System.gc();不会阻塞程序的进行
            因此先执行System.out.println("程序退出了...");
         */
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }
    //重写finalize方法


    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁汽车->" + name);
        System.out.println("释放了某些资源...");
    }
}
