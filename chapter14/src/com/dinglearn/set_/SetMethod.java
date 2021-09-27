package com.dinglearn.set_;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Ding
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SetMethod {
    public static void main(String[] args) {
        //解读
        //1.以Set接口的实现类HashSet来讲解 Set 接口的方法
        //2.set接口的实现类的对象(Set接口对象) 不能存放重复额的元素 可以添加一个null
        //3.set接口对象存放的数据是无序的(即添加的顺序和取出的顺序不一致)
        //4.注意:取出的顺序虽然不是添加的顺序,但是它是固定的
        Set set = new HashSet();
        set.add("ding");
        set.add("lucy");
        set.add("drew");
        set.add("kevin");
        set.add("durant");
        set.add("ding");//重复
        set.add(null);
        set.add(null);//再次添加null

        for (int i = 0; i < 10; i++) {
            System.out.println("set = " + set);
        }

        //遍历
        //方式1:使用迭代器
        System.out.println("===迭代器===");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj = " + obj);
        }

        set.remove(null);

        //方式2:使用增强for循环
        System.out.println("===增强for===");
        for(Object o : set) {
            System.out.println("o = " + o);
        }

        //set接口对象,不能通过索引来


    }
}