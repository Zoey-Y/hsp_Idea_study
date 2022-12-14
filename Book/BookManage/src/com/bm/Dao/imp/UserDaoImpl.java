package com.bm.Dao.imp;

import com.bm.Dao.BaseDao;
import com.bm.Dao.UserDao;
import com.bm.entity.Users;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public boolean addUser(Users users) {
        String sql = "insert into users values(0,?,?);";
        int result = this.execute(sql,
                users.getName(),
                users.getPwd());
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Users getUsers(String name) {
        String sql = "select * from users where `name` = ?;";
        Connection connection = this.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setObject(1, name);//把加入的姓名加到参数
            ResultSet rs = statement.executeQuery();//执行查询结果集
            if (rs.next()) {//如果是true说明查到一条数据
                //封装数据成一个对象
                Users users = new Users();
                users.setId(rs.getInt("id"));
                users.setName(rs.getString("name"));
                users.setPwd(rs.getString("pwd"));
                return users;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Users getUsers(String name, String pwd) {
        String sql = "select * from users where `name` = ? and pwd = ?;";
        Connection connection = this.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setObject(1, name);//把加入的姓名加到参数
            statement.setObject(2,pwd);//加入密码
            ResultSet rs = statement.executeQuery();//执行查询结果集
            if (rs.next()) {//如果是true说明查到一条数据
                //封装数据成一个对象
                Users users = new Users();
                users.setId(rs.getInt("id"));
                users.setName(rs.getString("name"));
                users.setPwd(rs.getString("pwd"));
                return users;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
