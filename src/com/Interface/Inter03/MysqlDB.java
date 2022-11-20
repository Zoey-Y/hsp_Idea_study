package com.Interface.Inter03;
//Mysql是组里面马仔1号写的
public class MysqlDB implements DBInterface {
    //马仔1号的任务是写Mysql相关功能的，必须按照老大的规范实现方法
    @Override
    public void connect() {//马仔一号不会乱取名字了，马仔2，3号都得按照这样规范写
        System.out.println("Mysql连接...");
    }
    @Override
    public void close() {
        System.out.println("Mysql关闭...");
    }
}
