package com.dinglearn.customexception_;

/**
 * @author Ding
 * @version 1.0
 */
public class CustomException {
    public static void main(String[] args) {

        int age = 180;
        //要求范围在18 - 120之间,否则抛出一个自定义异常
        if (!(age >= 18 && age <= 120)) {
            //可以通过构造器,设置信息
            throw new AgeException("年龄需要在18-120之间");
        }
        System.out.println("你的年龄范围正确。");

    }
}

//自定义一个异常
//一般情况下,自定义异常是继承RuntimeException
//即把自定义异常做成运行时异常,好处是可以使用默认的处理机制
class AgeException extends RuntimeException {
    public AgeException(String message) {//构造器
        super(message);
    }
}
