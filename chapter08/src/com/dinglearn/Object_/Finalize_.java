package com.dinglearn.Object_;

public class Finalize_ {
    public static void main(String[] args) {

        Car bmw = new Car("宝马");
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }
}
