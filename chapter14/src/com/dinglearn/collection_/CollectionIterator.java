package com.dinglearn.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Ding
 * @version 1.0
 */
public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new Book("准备中", "陈奕迅", 2015));
        col.add(new Book("认了吧", "陈奕迅", 2007));
        col.add(new Book("上五楼的快活", "陈奕迅", 2009));

        System.out.println("col=" + col);
        //遍历col集合
        //1.先得到col对应的迭代器
        Iterator iterator = col.iterator();
        //2.使用while循环遍历
//        while (iterator.hasNext()) {//判断是否还有数据
//            //返回下一个元素,类型是Object
//            Object obj = iterator.next();
//            System.out.println("obj=" + obj);
//        }
        //快捷键 while => itit
        //显示所有的快捷键  ctrl + j
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj=" + obj);
        }
        //3.当退出while循环后,这是iterator迭代器,指向最后的元素
        //  iterator.next();//NoSuchElementException
        //4.如果希望再次遍历,需要重置迭代器
        iterator = col.iterator();
        System.out.println("===第二次遍历===");
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj=" + obj);
        }
    }
}
class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}