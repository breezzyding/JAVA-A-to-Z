package com.dinglearn.homework_;

public class Homework02 {
    public static void main(String[] args) {

        String name = "ding";
        String key = "123456";
        String email = "kevinding35@163.com";

        try {
            userRegister(name, key, email);
            System.out.println("恭喜你注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /*
     * 输入用户名 密码 邮箱 如果信息录入正确,则提示注册成功,
     * 否则生成异常对象
     * 要求:
     * (1)用户名长度为2或3或4
     * (2)密码长度为6,要求全是数字
     * (3)邮箱中包含@和.并且@在.的前面
     *
     *
     * 思路分析
     * (1)先编写方法userRegister(String name, String key, String email) {}
     * (2)针对输入的内容进行校验,如果发现有问题,就抛出异常,给出提示
     * (3)单独写一个方法,判断密码是否全部都是数字字符 boolean
     */

    //注册方法
    public static void userRegister(String userName, String key, String email) {

        //再加入一些校验
        if (!(userName != null && key != null && email != null)) {
            throw new RuntimeException("参数不能为null");
        }

        //过关
        //第一关:userName
        int userLength = userName.length();
        if (!(userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("用户名长度为2或3或4");
        }

        //第二关:key
        if (!(key.length() == 6 && isDigital(key))) {
            throw new RuntimeException("密码的长度为6,要求全是数字");
        }

        //第三关
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        //邮箱第一位不能是@ ----> i > 0
        //@在.的前面 ----> j > i
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱中包含@和. 并且@在.的前面");
        }


    }

    //单独写一个方法,判断密码是否全部都是数字字符 boolean
    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }


}

