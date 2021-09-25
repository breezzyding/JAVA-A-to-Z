package com.dinglearn.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ding
 * @version 1.0
 */
public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
//    void add(int index, Object ele):
//    在 index 位置插入 ele 元素
        //在index = 1的位置插入一个对象
        list.add(1,"齐天大圣");
        System.out.println("list=" + list);

//    boolean addAll(int index, Collection eles):
//    从 index 位置开始将 eles 中的所有元素添加进来
        List list2 = new ArrayList();
        list2.add("ding");
        list2.add("Ding");

        list.addAll(2, list2);
        System.out.println("list=" + list);

//    Object get(int index):
//    获取指定 index 位置的元素
        System.out.println(list.get(3));

//    int indexOf(Object obj):
//    返回 obj 在集合中首次出现的位置
        System.out.println(list.indexOf("ding"));

//    int lastIndexOf(Object obj):
//    返回 obj 在当前集合中末次出现的位置
        list.add("张三丰");
        System.out.println("list=" + list);
        System.out.println(list.lastIndexOf("张三丰"));

//    Object remove(int index):
//    移除指定 index 位置的元素，并返回此元素
        System.out.println(list.remove(5));
        System.out.println("list=" + list);

//    Object set(int index, Object ele):
//    设置指定 index 位置的元素为 ele , 相当于是替换. list.set(1, "玛丽");
        list.set(4,"林黛玉");
        System.out.println("list=" + list);

//    List subList(int fromIndex, int toIndex):
//    返回从 fromIndex 到 toIndex 位置的子集合
        System.out.println("subList=" + list.subList(1, 3));
        //注意返回的子集合 fromIndex <= subList < toIndex


    }
}