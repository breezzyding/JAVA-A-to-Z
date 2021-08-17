package com.dinglearn.encap;

/**
 * 1.Account类要求具有属性：姓名(长度为2位3位或4位) 余额(必须>20)
 * 密码(必须是六位) 如果不满足，则给出提示信息，并给默认值
 * 2.通过setXxx的方法给Account的属性赋值
 * 3.在AccountTest中测试
 * <p>
 * 格式化 ctrl alt L
 * <p>
 * 提示知识点：
 * String name = "";
 * int len = name.length();
 */
public class Account {
    //为了封装，将3个属性设置为private
    private String name;
    private double balance;
    private String password;

    //提供两个构造器
    public Account() {
    }

    public Account(String name, double balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 1 && name.length() < 5) {
            this.name = name;
        } else {
            System.out.println("您输入的名字信息有误，长度应为2位、3位或4位，将使用默认姓名");
            this.name = "who?";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("您的余额小于20了,默认为0");
            this.balance = 0;
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("您的密码有误，长度必须是六位，将使用默认密码");
            this.password = "123456";
        }
    }

    //显示账号信息
    public void showInfo() {
        //可以增加权限的校验
        System.out.println("账号信息 name=" + name + " 余额=" + balance + " 密码=" + password);
//             if () {
//                 System.out.println("账号信息 name=" + name + " 余额=" + balance + " 密码=" + password);
//             } else {
//                 System.out.println("你无权查看");
//             }
    }
}
