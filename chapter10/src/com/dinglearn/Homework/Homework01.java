package com.dinglearn.Homework;

/**
 * @author Ding
 * @version 1.0
 */
public class Homework01 {
    /*
       请问输出结果是什么
       9.0    red
       100.0  red

     */
    public static void main(String[] args) {

        Car car = new Car();
        Car car1 = new Car(100);
        System.out.println(car);//
        System.out.println(car1);//

    }
}

class Car {
    double price = 10;
    static String color = "white";
    public String toString() {
        return price + "\t" + color;
    }

    public Car() {
        this.price = 9;
        this.color = "red";
    }

    public Car(double price) {
        this.price = price;
    }
}
