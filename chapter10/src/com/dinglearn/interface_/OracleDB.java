package com.dinglearn.interface_;

public class OracleDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("连接oracle");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭oracle");
    }
}
