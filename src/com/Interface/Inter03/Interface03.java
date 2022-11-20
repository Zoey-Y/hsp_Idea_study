package com.Interface.Inter03;

public class Interface03 {
    public static void main(String[] args) {
        //主函数中调用
        //当想要连接Mysql就new一个MysqlDB
        MysqlDB mysqlDB = new MysqlDB();
        //由于这里的t摆在了下面static了就不用创建对象了
        t(mysqlDB);//传mysqlDB这个对象给t，这就ok了
        //同理想要连接Oracle
        OracleDB oracleDB = new OracleDB();
        t(oracleDB);
    }
    /*理解：
   1.引入接口对象，由于各种类与接口建立关系，所以接口就包含了各种类和各种类的功能
   2.现在将这个接口对象安装到t里面,就像笔记本电脑边边开了个usb接口可以连接各种不同的设备
   */
    public static void t(DBInterface db){//DBInterface db接收其中一个对象
        db.connect();
        db.close();
    }
}
