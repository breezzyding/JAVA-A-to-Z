package com.dinglearn;

import com.dinglearn.Homework.Airplane;
import com.dinglearn.Homework.Horse;
import com.dinglearn.Homework.Vehicles;

/**
 * @author Ding
 * @version 1.0
 */
public class Person {
    private String name;
    private Vehicles vehicles;

    //在创建人对象时,事先给他分配一个交通工具
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    //实例化Person对象"唐僧",要求一般情况下用Horse作为交通工具
    //遇到大河时用Boat作为交通工具
    //这里涉及到一个编程思想,就是可以把具体的要求,封装成方法
    //思考一个问题,如何不浪费,在构建对象时,传入的交通工具对象
    public void passRiver() {
        //先得到船
//        Boat boat = VehiclesFactory.getBoat();
//        boat.work();

        //判断一下,当前的vehicles属性是null,就获得一艘船
        //如何防止始终使用的是传入的马, 使用 instanceof
        //vehicles instanceof Boat 是判断 当前的 vehicles是不是Boat
        //(1) vehicles = null : vehicles instanceof Boat ==> false
        //(2) vehicles = 马对象 : vehicles instanceof Boat ==> false
        //(3) vehicles = 船对象 : vehicles instanceof Boat ==> true
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }

    public void common() {
        //得到马儿
        //判断一下,当前的vehicles属性是null,就获取一匹马
        if (!(vehicles instanceof Horse)) {
            //使用的是多态,向上转型
            vehicles = VehiclesFactory.getHorse();
        }
        //使用接口调用
        vehicles.work();
    }

    public void flamingMountain() {
        if (!(vehicles instanceof Airplane)) {
            vehicles = VehiclesFactory.getAirplane();
        }
        vehicles.work();
    }
}
