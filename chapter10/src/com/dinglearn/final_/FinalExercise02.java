package com.dinglearn.final_;

public class FinalExercise02 {
    public static void main(String[] args) {

    }
}

class Something{
    public int addOne(final int x) {//代码是否有误?
        //++x;//修改final x 错误
        return x + 1;
    }
}