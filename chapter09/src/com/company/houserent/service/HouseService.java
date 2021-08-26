package com.company.houserent.service;

import com.company.houserent.domain.House;

/**
 * HouseService.java <=> 类 ---> 【业务层】
 * //定义House[]数组,存放所有房屋信息
 * 1.响应HouseView的调用
 * 2.完成对房屋信息的各种操作（增删改查）
 * C[crate] R[read] U[update] D[delete]
 */
public class HouseService {

    private House[] houses;//保存House对象
    private int houseNums = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前的id增长到哪个值

    public HouseService(int size) {
        houses = new House[size];//当创建HouseService对象,制定数组大小
        //为了配合测试列表信息,这里初始化一个House对象
        houses[0] = new House(1, "jack", "112", "海淀区", 2000, "未出租");

    }

    //编写list方法,返回houses
    public House[] list() {
        return houses;
    }

    //编写add方法,添加新对象,返回boolean
    public boolean add(House newHouse) {
        //判断是否还可以继续添加(暂时不考虑数组扩容的问题) ==> 能都自己加入数组扩容机制
        if (houseNums == houses.length) {//不能再添加了
//            System.out.println("数组已满,不能再添加...");
//            return false;

            //数组扩容机制
            House[] exHouse = new House[houses.length + 1];
            for (int i = 0; i < houses.length; i++) {
                exHouse[i] = houses[i];
            }
            houses = exHouse;

        }

        //把newHouse对象加入到
        //houseNums++写进houses[houseNums]中
        houses[houseNums++] = newHouse;

        //需要设计一个id自增长的机制
        //把idCounter++写进setId(idCounter)中
        newHouse.setId(++idCounter);
        return true;
    }
}
