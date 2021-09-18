package com.dinglearn.date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Ding
 * @version 1.0
 */
public class LocalDate_ {
    public static void main(String[] args) {
        /*
         * 第三代日期
         * 1.使用now() 返回表示当前日期时间的对象
         *
         * LocalDate(日期/年月日)
         * LocalTime(时间/时分秒)
         * LocalDateTime(日期时间/年月日时分秒)
         */

        LocalDateTime ldt = LocalDateTime.now();//LocalDate.now();//LocalTime.now();
        System.out.println(ldt);

        //2.使用DateTimeFormatter 对象来进行格式化
        //创建 DateTimeFormatter对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String format = dateTimeFormatter.format(ldt);
        System.out.println("格式化的日期=" + format);


        System.out.println("年=" + ldt.getYear());
        System.out.println("月=" + ldt.getMonth());//大写英文字母  SEPTEMBER
        System.out.println("月=" + ldt.getMonthValue());//数字    9
        System.out.println("日=" + ldt.getDayOfMonth());
        System.out.println("时=" + ldt.getHour());
        System.out.println("分=" + ldt.getMinute());
        System.out.println("秒=" + ldt.getSecond());


        //使用now() 返回表示当前日期时间的对象
        LocalDate now = LocalDate.now();//可获取年月日
        LocalTime now1 = LocalTime.now();//可获取时分秒

        //提供plus和 minus方法可以对当前时间进行加或者减
        //看看890天后,是什么时候 把 年月日-时分秒
        LocalDateTime localDateTime = ldt.plusDays(890);
        System.out.println("890天后=" + dateTimeFormatter.format(localDateTime));

        //看看3456分钟前是什么时候,把年月日-时分秒输出
        LocalDateTime localDateTime1 = ldt.minusMinutes(3456);
        System.out.println("3456分钟前 日期=" + dateTimeFormatter.format(localDateTime1));


    }
}
