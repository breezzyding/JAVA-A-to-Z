package com.dinglearn.list_;

import java.util.ArrayList;

/**
 * @author Ding
 * @version 1.0
 */
public class ArrayListDetail {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        //ArrayList 是线程不安全的 --> 源码中并没有加关键字修饰 synchronized
        /*
        源码:
            public boolean add(E e) {
                ensureCapacityInternal(size + 1);  // Increments modCount!!
                elementData[size++] = e;
                return true;
            }
         */
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add("ding");
        arrayList.add(null);
        arrayList.add("hsp");
        System.out.println(arrayList);
    }
}