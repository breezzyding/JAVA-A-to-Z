package com.dinglearn.Homework;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * @author Ding
 * @version 1.0
 */
public class Homework08 {
    /*
    1.创建一个Color枚举类
    2.有RED BLUE BLACK YELLOW GREEN 这五个枚举值/对象
    3.Color有三个属性redValue,greenValue,blueValue
    4.创建构造方法,参数包括这三个属性
    5.每个枚举类值都要给这三个属性赋值,三个属性对应的值分别是
      red:255,0,0 blue:0,0,255 green:0,255,0 black:0,0,0 yellow:255,255,0
    6.定义接口,里面有方法show,要求Color实现该接口
    7.show方法中显示三属性的值
    8.将枚举对象在switch语句中匹配使用
     */
    public static void main(String[] args) {
        Color blue = Color.BLUE;
        Color yellow = Color.YELLOW;
        blue.show();
        yellow.show();

        switch (yellow) {
            case RED:
                System.out.println("匹配到红色");
                break;
            case YELLOW:
                System.out.println("匹配到黄色");


        }

    }
}

enum Color implements IColor {
    //五个枚举对象
    RED(255, 0, 0), BLUE(0, 0, 255),
    BLACK(0, 0, 0), YELLOW(255, 255, 0),
    GREEN(0, 255, 0);

    //三个属性
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("三属性的值为:" + "redValue=" + redValue +
                ", greenValue=" + greenValue + ", blueValue=" + blueValue);
    }


}
