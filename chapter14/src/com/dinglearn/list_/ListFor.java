package com.dinglearn.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Ding
 * @version 1.0
 */
public class ListFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        /*
        1) 方式1:使用iterator
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
        }

        2) 方式2:使用增强for
        for(Object o : col) {
        }

        3) 方式3:使用普通for
        for (int i = 0; i < list.size(); i++) {
            Object object = list.get(i);
            System.out.println(object);
        }
         */

        //List 接口的实现子类 Vector LinkedList
        //List list = new Vector();
        //List list = new LinkedList();
        List list = new ArrayList();

        list.add("ding");
        list.add("meng");
        list.add("鱼香肉丝");
        list.add("烧鸡翼");

        //遍历
        //方式1
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }
        System.out.println();

        //方式2
        for (Object obj : list) {
            System.out.println(obj);
        }
        System.out.println();

        //方式3
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.println(obj);
        }

    }
}