package com.dinglearn;

import com.dinglearn.Homework.Airplane;
import com.dinglearn.Homework.Horse;

/**
 * @author Ding
 * @version 1.0
 */
public class VehiclesFactory {
    //马儿始终是同一匹
    private static Horse hores = new Horse();//饿汉式

    private VehiclesFactory() {
    }

    //创建交通工具工厂类,有两个方法分别获得交通工具Horse和Boat
    //这里,我们将方法做成static
    public static Horse getHorse() {
//        return new Horse();
        return hores;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Airplane getAirplane() {
        return new Airplane();
    }
}