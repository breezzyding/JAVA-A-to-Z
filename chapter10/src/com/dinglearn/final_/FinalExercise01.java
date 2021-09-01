package com.dinglearn.final_;

/**
 * 请编写一个程序,能够计算圆形的面积,要求圆周率为3.14
 * 赋值的位置3个方式都写一下
 */
public class FinalExercise01 {
    public static void main(String[] args) {

        Circle Circle1 = new Circle();
        Circle1.calAreaCircle(3);

    }
}

/**
 * 计算园的面积
 */
class Circle {
    private double radius;
    //Method 1
    private final static double PI = 3.14;

    public Circle(double radius, double PI1) {
        this.radius = radius;
        this.PI1 = PI1;
    }

    public Circle(double PI1) {
        this.PI1 = PI1;
    }

    //Method 2
    private final double PI1;
    public Circle() {
        PI1 = 3.14;
    }

    //Method 3
    private final static double PI2;
    static {
        PI2 = 3.14;
    }

    public void calAreaCircle(double radius) {
        System.out.println("园的面积是" + radius * radius * PI);
    }
}