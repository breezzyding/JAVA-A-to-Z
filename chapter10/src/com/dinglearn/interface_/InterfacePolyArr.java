package com.dinglearn.interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {

        //多态数组
        Usb[] usbs = new Usb[2];
        usbs[0] = new myPhone();
        usbs[1] = new myCamera();
        /*
        给Usb数组中,存放在myPhone和myCamera对象 myPhone类还有一个特有的方法call()
        请遍历Usb数组,如果是myPhone对象,除了调用Usb接口定义的方法外
         */
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            //和前面一样,仍然需要进行类型的向下转型
            if (usbs[i] instanceof myPhone) {//判断它的运行类型是myPhone
               ((myPhone) usbs[i]).call();
            }
        }

    }
}

interface Usb{
    public void work();
}
class myPhone implements Usb {
    @Override
    public void work() {
        System.out.println("手机工作中...");
    }

    public void call() {
        System.out.println("正在通话...");
    }
}

class myCamera implements Usb {
    @Override
    public void work() {
        System.out.println("相机工作中...");
    }

}
