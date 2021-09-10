package com.dinglearn.try_;

/**
 * @author Ding
 * @version 1.0
 */
public class TryCatchDetail {
    public static void main(String[] args) {

        /*
        try-catch-finally

        try {
            代码可能有异常
        }catch(Exception e) {
            //捕获到异常
            //1.当异常发生时
            //2.系统将异常封装成Exception对象e 传递给catch
            //3.得到异常对象后,程序员,自己处理
            //4.注意,如果没有发生异常catch代码块不执行
        }finally {
            //不管try代码是否有异常发生,始终要执行finally
            //所以,通常将释放资源的代码,放在finally
        }
         */

        //解读
        //1.如果异常发生了,则异常发生后面的代码不会执行,直接进入到catch
        //2.如果异常没有发生,则顺序执行try的代码块,不会进入到catch
        //3.如果希望不管是否发生异常,都执行某段代码(比如关闭连接,释放资源等)则使用如下代码-finally
        try {
            String str = "小丁";
            int a = Integer.parseInt(str);
            System.out.println("数字:" + a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息=" + e.getMessage());
        } finally {
            System.out.println("finally代码块被执行...");
        }

        System.out.println("程序继续...");
    }
}
