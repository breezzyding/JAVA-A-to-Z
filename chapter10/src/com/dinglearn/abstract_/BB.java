package com.dinglearn.abstract_;

public class BB extends Template{

    @Override
    public void job() {//重写
        long num = 0;
        for (long i = 1; i < 50000; i++) {
            num *= i;
        }
    }
}
