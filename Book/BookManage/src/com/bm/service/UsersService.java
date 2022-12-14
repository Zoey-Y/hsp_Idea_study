package com.bm.service;

import com.bm.Dao.UserDao;
import com.bm.Dao.imp.UserDaoImpl;
import com.bm.entity.Users;

public class UsersService {
    UserDao userDao = new UserDaoImpl();

    /**
     * 登陆业务
     * @param name
     * @param pwd
     * @return
     */
    public Users login(String name, String pwd){
        //根据用户名和密码进行查询
        Users users = userDao.getUsers(name, pwd);
        return users;
    }


    /**
     * 注册业务
     * @param users
     * @return
     */
    public  boolean register(Users users) throws Exception{//throws是声明的意思(这时谁调用它谁就知道了是这个异常)
        //先查重
        Users temp = userDao.getUsers(users.getName());
        if (temp == null) {//temp为null说明没有重复用户数据
            //将users对象所有数据传输到addUser里头
            boolean result = userDao.addUser(users);
            return result;
        }else{//已有此用户
            //由于此处的false分不清是注册重复还是其它的什么原因出错
            //但程序员是知道这里是重复注册导致的异常,可用此方法解决
            throw new Exception("姓名已经存在,请换个用户名");//抛出异常之后都不执行了
        }
    }
}
