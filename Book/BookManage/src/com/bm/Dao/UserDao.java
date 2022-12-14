package com.bm.Dao;

import com.bm.entity.Users;

import java.sql.SQLException;

public interface UserDao {
    //新增user
    boolean addUser(Users user);

    /*查询:*/
    //根据姓名查询查询一条用户信息
    Users getUsers(String name);

    //根据用户名和密码查询
    Users getUsers(String name,String pwd);//重载

}
