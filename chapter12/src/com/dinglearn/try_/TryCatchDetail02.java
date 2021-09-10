package com.dinglearn.try_;

import com.dinglearn.exception.NullPointerException_;

/**
 * @author Ding
 * @version 1.0
 */
public class TryCatchDetail02 {
    public static void main(String[] args) {

        //解读
        //1.如果try代码块有可能有多个异常
        //2.可以使用多个catch分别捕获不同的异常
        //3.要求子类异常写在前面,父类异常写在后面
        //4.可以有多个catch语句,捕获不同的异常(进行不同的业务处理),
        //  要求父类异常在后,子类异常在前,比如(Exception在后,NullPointerException在前)
        //  如果发生异常,只会匹配一个catch,案例演示
        //5.可以进行try-finally配合使用,这种用法相当于没有捕获异常,因此程序会直接崩掉
        //  应用场景:执行一段代码,不管是否发生异常,都必须执行某个业务逻辑

        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName());//NullPointerException
            int n1 = 10;
            int n2 = 0;
            int res = n1/n2;//ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("空指针异常=" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("算数异常=" + e.getMessage());
        } catch (Exception e) {
            System.out.println("出现异常=" + e.getMessage());
        } finally {
            System.out.println("finally");
        }

        System.out.println("程序继续执行...");

    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }
}

