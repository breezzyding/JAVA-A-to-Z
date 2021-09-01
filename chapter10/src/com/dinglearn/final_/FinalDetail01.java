package com.dinglearn.final_;

/**
 * 1)final修饰的属性又叫常量 一般用 XX_XX_XX 来命名
 * 2)final修饰的属性在定义时,必须赋初值,并且以后不能再修改,赋值可以在如下位置之一
 *      1.定义时: public final double TAX_RATE = 0.08
 *      2.在构造器中
 *      3.在代码块中
 * 3)如果final修饰的属性是静态的,则初始化的位置只能是
 *      1.定义时
 *      2.在静态代码块,不能再构造器中赋值
 * 4)final类不能继承,但是可以实例对象
 * 5)如果类不是final类,但是含有final方法,则该方法虽然不能重写,但是可以被继承
 */
public class FinalDetail01 {
    public static void main(String[] args) {

        CC cc = new CC();
        EE ee = new EE();
        ee.cal();
    }
}

class AA {
    /*
    1.定义时: public final double TAX_RATE = 0.08
    2.在构造器中
    3.在代码块中
     */
    public final double TAX_RATE1 = 0.08;
    public final double TAX_RATE2;
    public final double TAX_RATE3;

    public AA() {
        TAX_RATE2 = 1.1;
    }

    {
        TAX_RATE3 = 0.03;
    }
}

class BB {
    /*
    如果final修饰的属性是静态的,则初始化的位置只能是
        1.定义时
        2.在静态代码块,不能再构造器中赋值
     */
    public static final double TAX_RATE01 = 0.08;
    public static final double TAX_RATE02;
    //无法在构造器中给值(因为可能不创建对象)
//    public static final double TAX_RATE03;
//
//    public BB() {
//        TAX_RATE03 = 0.06;
//    }
    static {
        TAX_RATE02 = 0.06;
    }
}

//final类不能继承,但是可以实例化对象
final class CC { }

//如果类不是final类,但是含有final方法
//则该方法虽然不能重写,但是可以被继承
class DD {
    public final void cal() {
        System.out.println("cal()方法");
    }
}

class EE extends DD { }
