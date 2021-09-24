package com.dinglearn.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Ding
 * @version 1.0
 */
public class CollectionFor {
    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new Book("准备中", "陈奕迅", 2015));
        col.add(new Book("认了吧", "陈奕迅", 2007));
        col.add(new Book("上五楼的快活", "陈奕迅", 2009));

        //使用增强for
        //增强for底层仍然是迭代器
        //增强for可以理解成就是简化版的迭代器遍历
        //快捷方式I
        for(Object book : col) {
            System.out.println("book=" + book);
        }
        //增强for也可以直接在数组使用
//        int[] nums = {1, 8, 10, 90};
//        for (int i : nums) {
//            System.out.println(nums[i]);
//        }



    }
}