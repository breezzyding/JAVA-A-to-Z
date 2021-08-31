package com.dinglearn.static_;

public class Test {
    static int count = 9;
    public void count() {
        System.out.println("count=" + (count++));
    }

    public static void main(String[] args) {
        new Test().count();
        new Test().count();
        System.out.println(Test.count);
    }

}
