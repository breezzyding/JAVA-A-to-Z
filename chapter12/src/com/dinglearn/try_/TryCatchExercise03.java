package com.dinglearn.try_;

/**
 * @author Ding
 * @version 1.0
 */
public class TryCatchExercise03 {
    public static int method() {
        int i = 1;
        try {
            i++;//i = 2
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
            return ++i;//i = 3 => 保存到临时变量 temp = 3
            //这里返回的结果是临时变量的temp,而不是i
        } finally {
            ++i;//i = 4
            System.out.println("i=" + i);//i=4
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}

/*
    输出什么?
    i=4
    3   正确
    [解析:的确会抛出NullPointerException,执行return语句
         但是finally是一定会执行的,故最后返回的是4]


 */
