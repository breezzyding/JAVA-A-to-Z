package com.dinglearn.interface_;



public class InterfaceDetail02 {
    public static void main(String[] args) {
        //证明接口中的属性是 public static final 这样的
        System.out.println(IB.n1);//静态属性 static

    }
}

//接口的修饰符只能是 public 和 默认的 这点和类的修饰符是一样的
interface IB {
    //接口中的属性,只能是final的,而且是public static final 修饰符
    int n1 = 10;//等价于是 public sttic final int n1 = 10;
    void hi();
}
interface IC {
    void say();
}

//接口不能继承其他的类,但是可以继承多个别的接口
interface ID extends IB, IC {

}

//一个类同时可以实现多个接口
class Pig implements IB, IC {
    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}