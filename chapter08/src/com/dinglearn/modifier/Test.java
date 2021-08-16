/*
    访问修饰符 ----> 4)成员方法的访问规则和属性完全一样

    访问级别    访问控制修饰符     同类  同包  子类  不同包
    公开       public           √     √     √     √
    受保护     protected         √     √     √     ×
    默认       没有修饰符         √     √     ×     ×
    私有       private          √     ×     ×     ×


    使用的注意事项
    1)修饰符可以用来修饰类中的属性，成员方法以及类
    2)只有默认的和public才能修饰类！并且遵循上述访问权限的特点
    3)因为没有学习继承，因此关于在子类中的访问权限，讲完子类后，再来讲解
    4)成员方法的访问规则和属性完全一样

 */

package com.dinglearn.modifier;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
        B b = new B();
        b.say();


    }
}

//只有默认的和public才能修饰类！并且遵循上述访问权限的特点
class Tiger { }
