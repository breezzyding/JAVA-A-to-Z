package com.dinglearn.Homework;

/**
 * @author Ding
 * @version 1.0
 */
public class Car07 {//车类
    private double temperature;//温度

    public Car07(double temperature) {
        this.temperature = temperature;
    }

    class Air {//车内空调
        public void flow() {//吹风
            if (temperature > 40) {
                System.out.println("空调吹冷气");
            } else if (temperature < 0) {
                System.out.println("空调吹暖气");
            } else
                System.out.println("温度正常,关闭空调");
        }
    }

    //返回一个Air对象
    public Air getAir() {
        return new Air();
    }
}
