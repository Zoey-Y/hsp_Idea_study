package com.bm.Dao;

import com.bm.entity.Book;

import java.util.List;

/*创建目的:对图书信息实现增删改查*/
public interface BookDao {
    //增加书本:Book book传回来只是一条数据
    boolean addBook(Book book);//Book来自于实体创建类
    //删除书本
    boolean deleteBook(Long bId);//根据id删除一本书
    //修改一本书
    /*1.根据id修改一条图书数据
    * 2.修改一本书,id是主键,自增的,所以不能修改
    * 3.能修改的是:bName\bAuthor\bTime\bType*/
    boolean updateBook(Book book);//要改一本书就要传回来这本书的所有数据

    /*查询书:根据书名模糊查询一个列表
    查回来是个集合,
    所以返回来是 List<>:是个java接口,
    <>放的是传回来的目标中所有数据,这里是Book类
    (传回来是一堆数据,咱不知道这堆数据有多少,
   所以不能用数组)*/
    List<Book> getList(String bookName);//根据书名查,模糊查询

    /*根据编号查一整本书*/
    Book getBook(Long bId);
}
