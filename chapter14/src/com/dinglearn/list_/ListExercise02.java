package com.dinglearn.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Ding
 * @version 1.0
 */
public class ListExercise02 {
    @SuppressWarnings({"all"})
    /**
     * 使用List的实现类添加三本图书.并遍历,打印效果如下
     * 名称:XX       价格:XX       作者:XX
     * 名称:XX       价格:XX       作者:XX
     * 名称:XX       价格:XX       作者:XX
     *
     * 1) 按价格排序 从低到高(使用冒泡排序法)
     * 2) 要求使用ArrayList LinkedList Vector 三种集合实现
     */
    public static void main(String[] args) {

        //List list = new Vector();
        //List list = new LinkedList();
        List list = new ArrayList();
        list.add(new Book("双城记", 32.42, "狄更斯"));
        list.add(new Book("红楼梦", 30.46, "曹雪芹"));
        list.add(new Book("红与黑", 42.65, "司汤达"));

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }

        //从小到大(冒泡排序法)
        bubbleSort(list);

        System.out.println("===按价格从小到大排序后===");
        //再次遍历,应重置迭代器
        iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }
    }

    //静态方法
    public static void bubbleSort(List list) {

        //遍历
        int listSize = list.size();
        double temp = 0;
        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - 1 - i; j++) {
                //取出对象Book
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {//交换
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }

}