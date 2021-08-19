package com.dinglearn.poly_.detail_;


import com.dinglearn.extend_.Base;
import com.dinglearn.extend_.Sub;

public class PolyDetail02 {
    public static void main(String[] args) {
        //属性没有重写之说!属性的值看便宜类型
        Base02 base = new Sub02();//向上转型
        System.out.println(base.count);//10
        /**
         * base.count 直接就看base的编译类型
         * 这里与方法不同 方法看的是运行类型
         */
        Sub02 sub = new Sub02();//20
        System.out.println(sub.count);

    }
}

class Base02 {//父类
    int count = 10;//属性
}

class Sub02 extends Base02 {//子类
    int count = 20;//属性
}
