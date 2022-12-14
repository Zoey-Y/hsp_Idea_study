package com.bm.Dao;

import javafx.scene.chart.ScatterChart;

import javax.xml.transform.Result;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/*创建目的:创建连接,制定操作数据库的方法,c关闭资源*/
public class BaseDao {
    //加载驱动字符串的字符
    static String driverClass;
    //数据库的url地址
    static String url;
    //数据库用户名
    static String user;
    //数据库密码
    static String pwd;

    /*类信息被加载时执行,这里写代码块是为了给静态变量赋值*/
    static {
        //创建db.properties文件对象
        Properties properties = new Properties();
        try{
            //创建一个读取配置文件的输入流
            /*解释:BaseDao.class.getClassLoader().getResourceAsStream("db.properties");
            * 在咱BaseDao类里有默认的class(),其中有个加载类的getClassLoader()方法,
            * 这个方法里面有获取资源流的方法getResourceAsStream("db.properties")
            * db.properties为要获取资源文件*/
            InputStream is=BaseDao.class.getClassLoader().getResourceAsStream("db.properties");
            properties.load(is);//开始读取文件里的信息到properties对象中
            //给每个静态属性赋值
            driverClass = properties.getProperty("db.driver");
            url = properties.getProperty("db.url");
            user = properties.getProperty("db.user");
            pwd = properties.getProperty("db.password");
        }catch (IOException e){
            System.out.println("读取配置文件出错");
            e.printStackTrace();
        }
    }

    //1.创建连接数据库方法
    public Connection getConnection() {
        try {
            //注册驱动,jar包8.0要带上cj
            Class.forName(driverClass);
            //获取连接
            return DriverManager.getConnection(url, user, pwd);
        } catch(Exception e) {//类与sql的连接当然可能会报这两个的错误
            System.out.println("获取连接失败");
            e.printStackTrace();
        }
        return null;
    }
    /*2.执行一个增删改操作
    * sql: 带?的增删改语句
    * params 参数值列表
    * return 返回行数*/
    //传的是:(sql语句,sql里的参数值), ...是动态参数的意思,可以传多个也可以不传
    public int execute(String sql,Object... params){
        //获取一个连接,类型是Connection
        Connection connection = this.getConnection();
        try {
            //根据sql语句 和 连接,获取一个sql声明
            PreparedStatement stat = connection.prepareStatement(sql);
            //加入所有参数,params里面有多少参数就加入多少参数
            for (int i = 0; i < params.length; i++){
                stat.setObject(i + 1,params[i]);
            }
            int hang = stat.executeUpdate();//返回更新的行数
            this.closeAll(connection,stat,null);//关闭所有连接,传入实参的sql数据,结果
            return hang;//返回行数
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;//如果报错就返回0
    }

    /***
     * 关闭所有资源:
     * @param connection
     * @param stat
     * @param rs
     */
    //3.关闭数据库方法
    public void closeAll(Connection connection, PreparedStatement stat, ResultSet rs){
        //从尾到头关闭
        //先关resultSet,判断是否为空
        if (rs != null){
            try{
                rs.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        //其次再关闭PreparedStatement
        if (stat != null){
            try{
                stat.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        //最后关Connection连接
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
