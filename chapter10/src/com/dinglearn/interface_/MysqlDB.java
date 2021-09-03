package com.dinglearn.interface_;

public class MysqlDB implements DBInterface{

    @Override
    public void connect() {
        System.out.println("连接mysql");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭mysql");
    }
}
