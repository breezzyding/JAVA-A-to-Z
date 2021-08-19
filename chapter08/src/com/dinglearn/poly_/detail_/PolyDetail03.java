package com.dinglearn.poly_.detail_;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        /**
         * xxx instanceof XXX
         * 判断xxx的 运行类型 是否 为 XXX的类型或子类型
         *
         * 判断的是编译类型还是运行类型
         * 结论:运行类型!!!
         */
        System.out.println(bb instanceof BB);//true
        System.out.println(bb instanceof AA);//true

        //aa编译类型-->AA 运行类型-->BB
        AA aa = new BB();
        System.out.println(aa instanceof BB);//true
        System.out.println(aa instanceof AA);//true

        Object obj = new Object();
        System.out.println(obj instanceof AA);//false
        String str = "hello";
        //System.out.println(str instanceof AA);//无法比较
        System.out.println(str instanceof Object);//true
    }
}

class AA {//父类
}

class BB extends AA {
}
