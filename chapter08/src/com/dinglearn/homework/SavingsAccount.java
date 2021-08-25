package com.dinglearn.homework;

public class SavingsAccount extends BankAccount{
    //属性
    private int count = 3;
    private double rate = 0.01;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    /*
    扩展前一个练习的BankAccount类,新类SavingsAccount
    每个月都有利息产生(earnMonthlyInterest方法调用)
    并且有每月三次免手续费的存款或取款。在earnMonthlyInterest
    方法中要重置交易次数
     */

    @Override
    //存款
    public void deposit(double amount) {
        //判断是否还可以免手续费
        if (count > 0) {
            super.deposit(amount);
            count--;
        } else {
            super.deposit(amount - 1);
        }
    }

    @Override
    //取款
    public void withdraw(double amount) {
        //判断是否还可以免手续费
        if (count > 0) {
            super.withdraw(amount);
            count--;
        } else {
            super.withdraw(amount + 1);
        }
    }

    public void earnMonthlyInterest() {
        //重置count
        count = 3;
        //计算利润,父类的deposit没有手续费,也不会影响到次数
        super.deposit(getBalance() * rate);
    }

}
