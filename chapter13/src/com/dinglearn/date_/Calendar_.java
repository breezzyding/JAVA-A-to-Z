package com.dinglearn.date_;

import java.util.Calendar;

/**
 * @author Ding
 * @version 1.0
 */
public class Calendar_ {
    public static void main(String[] args) {
        //解读
        //1.Calendar是一个抽象类,并且构造器是private
        //2.可以通过getInstance()来获取实例
        //3.提供大量的方法和字段提供给程序员
        //4.Calendar 没有专门的格式化方法 所以需要程序员自己来组合
        //5.如果我们需要按照24小时进制来获取时间,Calendar.HOUR ==改成==>
        Calendar c = Calendar.getInstance();//创建日历类对象
        System.out.println(c);

        //获取日历对象的某个日历字段
        System.out.println("年: " + c.get(Calendar.YEAR));
        //这里为什么要 + 1, 因为Calendar返回月时候,是按照0开始编号
        System.out.println("月: " + (c.get(Calendar.MONTH) +  1));
        System.out.println("日: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时: " + c.get(Calendar.HOUR));
        System.out.println("分钟: " + c.get(Calendar.MINUTE));
        System.out.println("秒: " + c.get(Calendar.SECOND));

        //Calendar 没有专门的格式化方法 所以需要程序员自己来组合
        System.out.println(c.get(Calendar.YEAR) + "年" +
                c.get(Calendar.MONTH) + "月" +
                c.get(Calendar.DAY_OF_MONTH) + "日   " +
                c.get(Calendar.HOUR) + ":" +
                c.get(Calendar.MINUTE) + ":" +
                c.get(Calendar.SECOND));

        //Calendar存在的问题
        //1) 可变性:像日期和时间这样的类应该是不可变的
        //2) 偏移性:Date中的年份是从1900开始的,而月份都从0开始
        //3) 格式化:格式化只对Date有用,Calendar则不行
        //4) 此外,它们也不是线程安全,不能处理闰秒(每隔两天,就多+1s)
    }
}

/**
 * LocalDate(日期/年月日)
 */
