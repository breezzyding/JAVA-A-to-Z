package com.dinglearn.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();

        //add:添加单个元素
        list.add("ding");
        list.add(100);//list.add(new Interger(10))
        list.add(true);
        list.add('B');
        System.out.println("list=" + list);

        //remove:删除指定元素
        list.remove(0);//删除对应下标的元素
        list.remove(true);//指定删除某个元素
        System.out.println("list=" + list);

        //contains:查找元素是否存在
        System.out.println(list.contains("ding"));//false

        //size:获取元素个数
        System.out.println(list.size());//2

        //isEmpty:判断是否为空
        System.out.println(list.isEmpty());//false

        //clear:清空
        list.clear();
        System.out.println(list.isEmpty());//true

        //addAll:添加多个元素
        ArrayList list2 = new ArrayList();
        list2.add("厦门");
        list2.add("加油");
        list.addAll(list2);
        System.out.println("list=" + list);

        //containsAll:查找多个元素是否都存在
        System.out.println(list.containsAll(list2));//true

        //removeAll:删除多个元素
        list.add("厦门加油");
        list.removeAll(list2);
        System.out.println("list=" + list);

        //说明:以ArrayList实现类来演示
    }
}
