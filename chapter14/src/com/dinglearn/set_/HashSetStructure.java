package com.dinglearn.set_;

/**
 * @author Ding
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSetStructure {
    public static void main(String[] args) {
        //模拟一个HashSet的底层(HashMap的底层结构)

        //1.创建一个数组,数组的类型是Node[]
        //2.Node[] 称为 表 table
        Node[] table = new Node[16];
        System.out.println("table=" + table);
        //3.创建结点
        Node john = new Node("john",null);

        table[2] = john;
        System.out.println("table=" + table);



    }
}

class Node {//结点 存放数据 可以指向下一个结点 从而形成链表
    Object item;//存放数据
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}