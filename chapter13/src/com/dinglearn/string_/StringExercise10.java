package com.dinglearn.string_;

/**
 * @author Ding
 * @version 1.0
 */
public class StringExercise10 {
    public static void main(String[] args) {
        Test1 ex = new Test1();
        ex.changes(ex.str, ex.ch);
        System.out.print(ex.str + " and ");//ding and
        System.out.println(ex.ch);//hava
    }
}

class Test1 {
    String str = new String("ding");//指向堆 --> value --> "ding"
    final char[] ch = {'j', 'a', 'v', 'a'};

    public void changes(String str, char ch[]) {
        str = "java";//临时栈
        ch[0] = 'h';//不能指向其他对象,但是可以修改字符
    }
}
