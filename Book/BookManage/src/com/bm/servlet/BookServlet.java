package com.bm.servlet;
/*先将Tomcat的lib引入项目结构(ProjectStructure)中的lib*/
import com.bm.entity.Book;
import com.bm.service.BookService;
import com.bm.tools.ResponseUtil;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

//@来头的是注解,用于简化XML文件配置d
@WebServlet(name = "BookServlet",urlPatterns = "/book.html")//访问路径
public class BookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //业务方法就需要一个业务对象
        BookService bookService = new BookService();

        /*当一个表单请求交给servlet
        * 1.先处理字符集
        * 2.区分请求类型*/
        /*(1)先处理字符集*/
        request.setCharacterEncoding("utf-8");
        //jsp传过来的请求,要获取
        String action = request.getParameter("action");
        //就是来判别传进来的action被标记成增删查改的哪个(?action=啥)
        if (action.equals("add")){//(2)区分请求类型
            //根据bookAdd.jsp传过来的action=add的内容
            /*要完成:
            *     1.获取表单的四个数据
            *     2.封装成一个book对象
            *     3.调用业务方法,执行添加
            *     4.判定处理结果,给提示*/
            //1.以String的方式获取表单的四个数据(根据jsp给的name取)
            String name = request.getParameter("bookName");
            String author = request.getParameter("bookAuthor");
            String time = request.getParameter("bookTime");
            String type =  request.getParameter("bookType");
            //2.封装成一个book对象
            Book book = new Book();
            book.setbName(name);
            book.setbAuthor(author);//这两个都是字符串符合sql表的类型
            /*日期字符串 转 Date,需要用到
            日期格式化工具SimpleDateFormat
             ,格式:yyyy-MM-dd (指:年月日)
             HH:mm:ss (指:时分秒)*/
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
               Date bTime = sdf.parse(time);//parse:转化成日期
                //此时才能放进
                book.setbTime(bTime);
                //字符串转化成整数
                book.setbType(Integer.parseInt(type));
            } catch (Exception e) {
                e.printStackTrace();
            }
            //3.调用业务方法,执行添加
             boolean result = bookService.createBook(book);//将从网页获取的book信息封装好后传进来
            //4.判定处理结果,给提示
            if(result){//返回true就添加成功,返回false就添加失败
                ResponseUtil.alert(response,"添加成功","bookAdd.jsp");
            }else{
                ResponseUtil.alert(response,"添加失败","bookAdd.jsp");
            }
        }else if(action.equals("update")){//用于读取旧数据的(为修改旧数据准备)
            //1.获取要修改图书的编号
            String bId = request.getParameter("id");
            //2.调用查找业务,根据编号查整本书的 旧信息
            Book book = bookService.getBook(Long.parseLong(bId));
            //3.把整本书的信息存到request里
            request.setAttribute("book",book);
            //4.转发到modify.jsp页面,去显示
            request.getRequestDispatcher("modify.jsp").forward(request,response);
        }else if (action.equals("doUpdate")){//新数据的修改
            //1.获取需要修改的五个谢谢的新数据
            String bId = request.getParameter("bookId");
            String name = request.getParameter("bookName");
            String author = request.getParameter("bookAuthor");
            String time = request.getParameter("bookTime");
            String type =  request.getParameter("bookType");
            //2.封装成一个book对象
            Book book = new Book();
            book.setbId(Long.parseLong(bId));
            book.setbName(name);
            book.setbAuthor(author);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date bTime = null;
            try {
                bTime = sdf.parse(time);
                book.setbTime(bTime);
                book.setbType(Integer.parseInt(type));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            //3.调用业务方法,执行修改操作
            boolean result = bookService.modifyBook(book);
            //4.判断处理结果
            if (result){
                ResponseUtil.alert(response,"修改成功","index.jsp");
            }else {//修改失败的话把原来自己修改的内容保持不变在modify页面
                request.setAttribute("book",book);
                request.setAttribute("msg","修改失败");
                request.getRequestDispatcher("modify.jsp").forward(request,response);
            }
        }else if(action.equals("delete")){
            //1.获取图书编号
            String bid = request.getParameter("bid");
            //2.调用业务,执行删除
            boolean result = bookService.deleteBook(Long.parseLong(bid));
            //3.根据删除结果,返回浏览器响应
            PrintWriter out = response.getWriter();
            if (result){
                out.print("1");
            }else{
                out.print("0");
            }
        }else if (action.equals("query")){
            /*查询步骤:
            1.获取查询条件
            2.调用业务层方法,接收数据
            3.呈现给用户(数据给页面)放到request里
            4.转发到index.jsp*/
            //1.获取查询条件
            String name = request.getParameter("bookName");
            //2.调用业务层方法,接收数据.(头部已经new了一个service对象)
            List<Book> booksList = bookService.queryByName(name);
            //3.把数据放到request里,setAttribute("对传的数据的标注",将数据传进来的bookList)
            request.setAttribute("Date",booksList);
            //4.转发到index.jsp
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //由于doPost里的update接收到的是来自于网页的href(url),所以此时要用到doGet获取信息
        doPost(request,response);
    }
}
