package com.dinglearn.exception;

/**
 * @author Ding
 * @version 1.0
 */
public class ClassCastException_ {
    public static void main(String[] args) {

        A b = new B();//向上转型
        B b2 = (B)b;//向下转型,这里是OK
        C C2 = (C)b;//抛出ClassCastException

    }
}

class A {}
class B extends A {}
class C extends A {}
