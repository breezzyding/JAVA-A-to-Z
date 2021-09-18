package com.dinglearn.date_;


import java.time.Instant;
import java.util.Date;

/**
 * @author Ding
 * @version 1.0
 */
public class Instant_ {
    public static void main(String[] args) {

        //1.通过静态方法now()获取表示房钱时间戳的对象
        Instant now = Instant.now();
        System.out.println(now);
        //2.通过from可以把Instant转成Date
        Date date = Date.from(now);
        //3.通过date的toInstant() 可以把date 转成Instant对象
        Instant instant = date.toInstant();


    }
}
