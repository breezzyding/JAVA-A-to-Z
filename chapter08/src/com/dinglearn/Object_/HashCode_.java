package com.dinglearn.Object_;

/**
 * hashCode方法
 * 1)提高具有哈希结果的容器的效率
 * 2)两个引用 如果指向的是同一个对象 则哈希值肯定是一样的
 * 3)两个引用 如果指向的是不同对象,则哈希值是不一样的
 * 4)哈希值主要根据地址号来的,不能完全将哈希值等价于地址
 * 5)案例 public class HashCode_
 * 6)集合讲解时 会重写hashCode
 */
public class HashCode_ {
    public static void main(String[] args) {

        AA aa1 = new AA();
        AA aa2 = new AA();
        AA aa3 = aa1;
        System.out.println("aa1.hashCode()=" + aa1.hashCode());
        System.out.println("aa2.hashCode()=" + aa2.hashCode());
        System.out.println("aa3.hashCode()=" + aa3.hashCode());

    }
}

class AA {
}
