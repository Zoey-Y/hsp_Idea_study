package com.Interface.Inter03;
//马仔2号跟一号一样要按照老大的规范写connection和close操作了
public class OracleDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("Oracle连接...");
    }

    @Override
    public void close() {
        System.out.println("Oracle关闭...");
    }
}
