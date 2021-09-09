package com.dinglearn.Homework;

import javafx.scene.control.Cell;

/**
 * @author Ding
 * @version 1.0
 */
public class Homework04 {
    /*
        1.计算器接口具有work方法,功能是运算,有一个手机类Cellphone
          定义方法testWork,测试计算功能,调用计算接口的work方法
        2.要求调用CellPhone对象的testWork方法,使用上匿名内部类
     */
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        //解读
        //1.匿名内部类是
        /*
            new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return 0;
            }
            同时也是一个对象
            它的编译类型 ICalculate 它的运行类型就是 匿名内部类
         */
        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 10, 8);

        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        }, 10, 8);
    }
}

//编写接口
interface ICalculate {
    //work方法
    //至于该方法完成怎样的计算,交给匿名内部类完成
    public double work(double n1, double n2);
}

class Cellphone {
    //解读,当我们调用testWork方法时,直接传入一个实现了ICalculate接口的匿名内部类时
    //该匿名内部类,可以灵活的实现work,完成不同的计算
    public void testWork(ICalculate iCalculate, double n1, double n2) {
        double result = iCalculate.work(n1, n2);
        System.out.println("计算后的结果是=" + result);
    }


}

