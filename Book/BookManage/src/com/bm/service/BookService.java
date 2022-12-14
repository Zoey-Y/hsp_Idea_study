package com.bm.service;

import com.bm.Dao.BookDao;
import com.bm.Dao.imp.BookDaoImpl;
import com.bm.entity.Book;

import java.util.List;

/*创建目的:对Book表的所有业务操作,service层是调用已经实现好的功能层面*/
public class BookService {
    //增删改查的业务操作
    BookDao bookDao = new BookDaoImpl();
    //调用增删改查功能
    /***
     * 创建图书业务:
     * @param book
     * @return
     */
    public boolean createBook(Book book){
        return bookDao.addBook(book);
    }

    /***
     * 修改图书业务,根据id修改图书的其他信息
     * @param book
     * @return
     */
    public boolean modifyBook(Book book){
        return bookDao.updateBook(book);
    }

    /**
     * 删除一本图书,根据书的id
     * @param bId
     * @return
     */
    public boolean deleteBook(Long bId){
        return bookDao.deleteBook(bId);
    }

    /**
     * 根据部分书名,进行模糊查找一个书籍列表
     * @param bookName
     * @return
     */
    public List<Book> queryByName(String bookName){
        return bookDao.getList(bookName);
    }

    /**
     * 根据书的id查找书的 旧信息,
     * @param bId
     * @return
     */
    public Book getBook(Long bId){
        return bookDao.getBook(bId);
    }
}
