package com.dinglearn.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通的各个功能的类
 * 使用OOP(面向对象编程)
 * 将各个功能对应一个方法
 */
public class SmallChangeSystemOOP {

    //定义相关的变量
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);

    String pointer = "";

    //完成零钱通明细
    //思路
    //1.将收益入账和消费,保存到数组
    //2.使用对象
    //3.使用String拼接
    String details = "------------------零钱通明细------------------";

    //完成收益入账
    //定义新的变量
    //收益入账
    double income;
    //余额
    double balance = 0;
    //时间
    Date date = null;//data 是java.util.Date类型 表示日期
    //可以用于日期格式化
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    //消费
    //消费商品名称
    String goodsName;
    //消费金额
    double cost;

    //先完成显示菜单,并可以选择
    public void mainMenu() {
        do {
            System.out.println("\n------------------零钱通菜单------------------");
            System.out.println("\t\t\t\t1 零钱通明细");
            System.out.println("\t\t\t\t2 收益入账");
            System.out.println("\t\t\t\t3 消     费");
            System.out.println("\t\t\t\t4 退     出");

            System.out.print("请选择(1-4):");
            pointer = scanner.next();

            //使用switch分支控制
            switch (pointer) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.cost();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误,请重新选择");

            }

        } while (loop);
    }

    //完成零钱通明细
    public void detail() {
        System.out.println(details);
    }

    //完成收益入账
    public void income() {
        System.out.print("收益入账金额:");
        income = scanner.nextDouble();

        //过关斩将的思路!!!体会体会

        //找出不正确的金额条件,然后给出提示,就直接break
        if (income <= 0) {
            System.out.println("收益入账金额,需要大于0");
            return;//退出方法,不再执行后面的代码
        }

        balance += income;
        //拼接收益入账信息到details
        date = new Date();//获取当前的日期
        details += "\n收益入账\t+" + income + "\t" + sdf.format(date) + "\t" + "余额:" + balance;
    }

    //消费
    public void cost() {
        System.out.print("商品名称:");
        goodsName = scanner.next();
        System.out.print("消费金额:");
        cost = scanner.nextDouble();

        //找出金额不够的条件,然后给出提示,就直接break
        if (balance - cost < 0) {//钱不够用
            System.out.println("支付失败,余额不足");
            return;
        }

        balance -= cost;
        date = new Date();//获取当前的日期
        details += "\n" + goodsName + "\t-" + cost + "\t" + sdf.format(date) + "\t" + "余额:" + balance;
    }

    //退出
    public void exit() {
        //退出
        //1.定义一个变量choice,接收用户输入
        //2.使用while + break 来处理接收到的输入时y或者n
        //3.退出while后,再判断choice是y还是n,就可以决定是否退出
        //4.建议一段代码,完成一个小功能,尽量不要混在一起
        String choice = "";
        while (true) {//要求用户必须输入y/n,否则就一直循环
            System.out.println("你确定要退出吗?y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }

        //当用户退出while,进行判断
        if (choice.equals("y")) {
            loop = false;
        }
    }

}
