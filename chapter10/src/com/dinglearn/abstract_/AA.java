package com.dinglearn.abstract_;

public class AA extends Template{

    //计算任务
    //1+...+10000

    @Override
    public void job() {//实现Template job()的方法重写
        long num = 0;
        for (long i = 1; i < 1000000; i++) {
            num += i;
        }
    }
}
