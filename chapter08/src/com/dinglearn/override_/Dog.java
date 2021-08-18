package com.dinglearn.override_;

public class Dog extends Animal {
    /**
     * 1.Dog是Animal子类
     * 2.Dog的cry方法和Animal的cry定义形式一样(名称,返回类型,参数)
     * 3.Dog的cry方法 重写了 Animal的cry方法
     */
    public void cry() {
        System.out.println("小狗汪汪汪...");
    }

    //细节:子类方法的返回类型和父类返回类型一样,或者是父类返回类型的子类
    //String是Object的子类
    public String m1() {
        return null;
    }

//    attempting to use incompatible return type
//    public Object m2() {
//        return null;
//    }

    public AAA m3() {//返回类型BBB也可!
        return null;
    }

    //attempting to assign weaker access privileges ('package-private'); was 'public'
    //父类是public,子类是默认  范围缩小了 错误
//    void eat() {
//
//    }

    public void eat() {

    }


}

class AAA {

}

class BBB extends AAA {

}


