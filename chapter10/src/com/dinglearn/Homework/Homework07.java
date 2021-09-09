package com.dinglearn.Homework;

/**
 * @author Ding
 * @version 1.0
 */
public class Homework07 {
    /*
    有一个Car类,有属性temperature(温度),车内有Air(空调)类,又吹风的功能flow
    Air会监视车内的温度,如果温度超过40度则吹冷气,如果温度低于0度则吹暖气,
    如果在这之间则关闭空调,实例化具有不同温度的Car对象,调用空调的flow方法,
    测试空调吹的风是否正确
     */
    public static void main(String[] args) {
        Car07 car071 = new Car07(60);
        car071.getAir().flow();
        Car07 car072 = new Car07(22);
        car072.getAir().flow();
        Car07 car073 = new Car07(-1);
        car073.getAir().flow();
    }
}


