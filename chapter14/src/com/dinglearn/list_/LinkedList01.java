package com.dinglearn.list_;

/**
 * @author Ding
 * @version 1.0
 */
public class LinkedList01 {
    public static void main(String[] args) {
        //模拟一个简单的双向链表

        Node ding = new Node("ding");
        Node justin = new Node("justin");
        Node stupid = new Node("笨蛋小丁");

        //连接三个结点,形成双向列表
        //ding -> justin -> stupid
        ding.next = justin;
        justin.next = stupid;
        //stupid -> justin -> ding
        stupid.pre = justin;
        justin.pre = ding;

        //让first引用指向jack,就是双向链表的头结点
        Node first = ding;
        //让last引用指向stupid,就是双向链表的尾结点
        Node last = stupid;

        //演示从头到位遍历
        System.out.println("===从头到尾进行遍历===");
        while(true) {
            if (first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }

        //演示从尾到头的遍历
        System.out.println("===从尾到头进行遍历===");
        while(true) {
            if (last == null) {
                break;
            }
            //输出last信息
            System.out.println(last);
            last = last.pre;
        }


        //演示链表的添加对象/数据,是多么的方便
        //要求,是在 justin 和 笨蛋小丁之间插入一个对象 drew

        //1.先创建一个Node结点,name就是drew
        Node drew = new Node("drew");
        //将drew加入双向列表
        drew.next = stupid;
        drew.pre = justin;
        justin.next = drew;
        stupid.pre = drew;

        //重置first 再次指向ding
        first = ding;

        //演示从头到位遍历
        System.out.println("===从头到尾进行遍历===");
        while(true) {
            if (first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }

    }
}

//定义一个Node类, Node对象表示双向链表的一个结点
class Node {
    public Object item;
    public Node next;
    public Node pre;
    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name = " + item;

    }
}