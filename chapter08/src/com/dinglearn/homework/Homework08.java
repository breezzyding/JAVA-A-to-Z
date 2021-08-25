package com.dinglearn.homework;

/**
 * 扩展如下的BankAccount类
 */
public class Homework08 {
    public static void main(String[] args) {

//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(10);//1000+10-1 = 1009
//        checkingAccount.withdraw(9);//1000-9-1 = 999
//        System.out.println(checkingAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(10000);
        savingsAccount.deposit(10);//10010
        savingsAccount.deposit(10);//10020
        savingsAccount.deposit(10);//10030
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(5000);//5029
        savingsAccount.earnMonthlyInterest();//5079.29
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(20);//免手续费
        savingsAccount.withdraw(20);
        savingsAccount.withdraw(20);
        System.out.println(savingsAccount.getBalance());//5019.29
        savingsAccount.withdraw(15);//收手续费
        System.out.println(savingsAccount.getBalance());//5003.29



    }

}
