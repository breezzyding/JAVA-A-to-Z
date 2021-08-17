package com.dinglearn.encap;

public class AccountTest {
    public static void main(String[] args) {
        //创建Account
        Account account = new Account();
        account.setName("dingdingding");
        account.setBalance(16);
        account.setPassword("17173517");

        account.showInfo();

    }


}
