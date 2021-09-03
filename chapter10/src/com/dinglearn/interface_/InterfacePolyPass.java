package com.dinglearn.interface_;

/**
 * 演示多态传递现象
 */
public class InterfacePolyPass {
    public static void main(String[] args) {

        //接口类型的变量可以指向 实现了该接口的类的对象实例
        IG ig = new Teacher();

        //如果IG继承了IH接口,而Teacher类实现了IG接口
        //那么,实际上就相当于Teacher类也实现了IH接口
        IH ih = new Teacher();
}
}

interface IH {
    void hi();
}
interface IG extends IH {}
class Teacher implements IG {
    @Override
    public void hi() {

    }
}
