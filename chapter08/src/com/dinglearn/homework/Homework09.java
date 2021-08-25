package com.dinglearn.homework;

import sun.security.mscapi.CPublicKey;

/**
 * 设计一个Point类 其x和y坐标可以通过构造器提供.提供一个子类LabeledPoint
 * 其构造器接受一个标签值和x,y坐标,
 * 比如:new LabeledPoint("Black Thursday", 1929, 230, 7)
 */
public class Homework09 {
    public static void main(String[] args) {

        LabeledPoint black_thursday = new LabeledPoint("Black Thursday", 1929, 230, 7);

    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class LabeledPoint extends Point{
    private String name;
    private int labeledNum;

    public LabeledPoint(String name, int labeledNum, int x, int y) {
        super(x, y);
        this.name = name;
        this.labeledNum = labeledNum;
    }
}
