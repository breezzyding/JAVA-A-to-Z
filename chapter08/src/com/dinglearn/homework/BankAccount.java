package com.dinglearn.homework;

/**
 * 扩展如下的BankAccount类
 * (1)在上面的基础上扩展,新类CheckingAccount
 * 对每次存款和取款都收取1美元的手续费
 * (2)扩展前一个练习的BankAccount类,新类SavingsAccount
 * 每个月都有利息产生(earnMonthlyInterest方法调用)
 * 并且有每月三次免手续费的存款或取款。在earnMonthlyInterest
 * 方法中要重置交易次数
 * (3)体会重写的好处
 */

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //存钱
    public void deposit(double amount) {
        balance += amount;

    }

    //取钱
    public void withdraw(double amount) {
        balance -= amount;
    }
}


