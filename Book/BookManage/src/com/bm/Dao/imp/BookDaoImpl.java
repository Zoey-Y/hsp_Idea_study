package com.bm.Dao.imp;

import com.bm.Dao.BaseDao;
import com.bm.Dao.BookDao;
import com.bm.entity.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*创建目的:继承BaseDao,实现BookDao接口的增删查改功能*/
public class BookDaoImpl extends BaseDao implements BookDao {

    @Override
    public boolean addBook(Book book) {
        //?是要被替换成要添加的书的对应信息
        String sql = "INSERT INTO Book VALUES(0,?,?,?,?);";
        //这里开始替换?了,按顺序替换,execute方法是继承BaseDao而来
        //result接收影响的行数
        int result = this.execute(sql,
                book.getbName(),
                book.getbAuthor(),
                book.getbTime(),
                book.getbType());
        //利用返回的行数判断师傅添加成功
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteBook(Long bId) {
        //?要删除书的id
        String sql = "DELETE FROM Book WHERE b_id = ?;";
        int result = this.execute(sql, bId);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updateBook(Book book) {
        /*根据id修改图书数据*/
        String sql = "UPDATE book SET " +
                "b_name = ?," +
                "b_author=?," +
                "b_time=?," +
                "b_type = ?  " +//这里问好注意要空格
                "WHERE b_id = ?;";
        int result = this.execute(sql,
                book.getbName(),
                book.getbAuthor(),
                book.getbTime(),
                book.getbType(),
                book.getbId());
        if (result > 0){
            return true;
        }
        return false;
    }

    /***
     * 根据书名模糊查询一个图书列表
     * @param bookName
     * @return
     */
    /*模糊查询步骤总结:
     * 1.传入sql语句
     * 2.建立三个组件(Connection,PreparedStatement,ResultSet)
     * 3.连接,获取sql语句,添加模糊查询的参数setObject(),得到sql查询之后传回来的结果给rs
     * 4.while循环,一个个将传回来的结果里的属性赋值
     * 5.将属性赋值好后的每个对象保存到list集合
     * 6.返回集合*/
    @Override
    public List<Book> getList(String bookName) {
        //定义一个空集合,用来存储查询出的结果
        /*List是一个接口所有不能直接new,只能new它的实现类ArrayList<>()*/
        List<Book> list = new ArrayList<Book>();//创一个空的集合

        /* 模糊查询like(包含,像)的含义
            一个%代表任意长度的字符串*/
        String sql = "SELECT * FROM book " +
                "WHERE b_name LIKE concat('%',?,'%');";
        //mysql里concat()代表拼接,将括号里三个参数拼接在一起
        //此时中间的?就可以写问号了

        //查询:三个组件查询必用
        Connection connection = null;
        PreparedStatement stmt = null;
        /*ResultSet:接收数据库传来的查询结果*/
        ResultSet rs = null;//注意:Set是要大写的,指的是java的sql包
        try {//操作链接:connection,获取sql:stmt,最后查询:rs
            connection = this.getConnection();//获取连接
            stmt = connection.prepareStatement(sql);//根据链接获取sql语句
            //加参数:若bookName返回一个空就是找所有书籍
            stmt.setObject(1, bookName);//因为是一个%,所以索引填1,内容是书名
            //执行查询:
            // executeQuery() 机制:把数据库响应的查询结果放在ResultSet类对象供我们使用
            rs = stmt.executeQuery();
            //读取读取数据库传来的查询结果,一个个往下找对应的被模糊查询的数据,直到找到目标数据
            //rs.next():查询下一行,rs是数据库传回来的已经筛选过的数据条,若为true说明有这行数据,就进入循环
            while (rs.next()) {
                /*制作步骤:
                 * 1.创建一个空对象,里面有许多书的空属性
                 * 2.将这些空属性赋值,赋的值是筛选过后的rs数据*/
                Book book = new Book();//空对象,为了存读出来的一行数据
                /*空对象里啥都没有,此时就需要将查到的数据一个个赋给书的每个属性*/
                //设置五个属性,汇聚成一个完整的书对象
                book.setbId(rs.getLong("b_id"));//rs.getLong():获取表单的类型Long,是bId的Long
                book.setbName(rs.getString("b_name"));//这里面的"XXX"关联的就是数据库了
                book.setbAuthor(rs.getString("b_author"));
                book.setbTime(rs.getTimestamp("b_time"));//Timestamp获取日期时间
                book.setbType(rs.getInt("b_type"));
                /*while执行完book对象就会被重写new了,
                 * 在book被清空之前,放到一个集合List里保存起来*/
                list.add(book);//将book加入集合存起来
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {//最终关闭所有组件
            this.closeAll(connection, stmt, rs);
        }
        return null;
    }

    @Override
    public Book getBook(Long bId) {
        String sql = "SELECT * FROM book where b_id = ?;";
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            connection = this.getConnection();
            stmt = connection.prepareStatement(sql);
            stmt.setObject(1,bId);
            rs = stmt.executeQuery();
            if (rs.next()){//判定读没读到若读到返回true
                Book book = new Book();
                book.setbId(rs.getLong("b_id"));//rs.getLong():获取表单的类型Long,是bId的Long
                book.setbName(rs.getString("b_name"));//这里面的"XXX"关联的就是数据库了
                book.setbAuthor(rs.getString("b_author"));
                book.setbTime(rs.getTimestamp("b_time"));//Timestamp获取日期时间
                book.setbType(rs.getInt("b_type"));
                return book;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
