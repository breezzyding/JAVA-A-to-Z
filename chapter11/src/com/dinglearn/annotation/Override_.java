package com.dinglearn.annotation;

/**
 * @author Ding
 * @version 1.0
 */
public class Override_ {
    public static void main(String[] args) {

    }
}

class Father{
    public void fly() {
        System.out.println("Father-fly");
    }
}

class Son extends Father {
    //解读
    //1. @Override 注解放在fly()方法上,表示类的fly方法时重写了父类的fly
    //2. 这里如果没有写@Override 还是重写了父类的fly()方法
    //3. 如果你写了@Override注解,编译器就会去检查该方法是否真的重写了父类的
    //   方法,如果的确重写了,则编译通过,如果没有构成重写,则编译错误
    //4. 看看@Override的定义
    //   解读:如果发现 @interface 表示一个 注解类
    /*
        @Target(ElementType.METHOD)
        @Retention(RetentionPolicy.SOURCE)
        public @interface Override {
        }

        @Target 是修饰注解的注解 称为源注解,记住这个概念
     */
    @Override //说明
    public void fly() {
        System.out.println("Son-fly");
    }
}
