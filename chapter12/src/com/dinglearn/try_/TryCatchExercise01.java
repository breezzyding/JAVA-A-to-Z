package com.dinglearn.try_;

/**
 * @author Ding
 * @version 1.0
 */
public class TryCatchExercise01 {
    public static int method() {
        try {
            String[] names = new String[3];//默认null
            if (names[1].equals("tom")) {//抛出 NullPointerException
                System.out.println(names[1]);
            } else {
                names[3] = "xiaoding";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return 3;
        } finally {
            return 4;
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}

/*
    输出什么?
    3   错误
    [解析:的确会抛出NullPointerException,返回3
         但是finally是一定会执行的,故最后返回的是4]

    正确答案
    4
 */
