<%@ page import="java.util.List" %>
<%@ page import="com.bm.entity.Book" %>
<%@ page import="com.bm.servlet.BookServlet" %>
<%@ page import="com.bm.tools.ResponseUtil" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.bm.entity.Users" %><%--
  Created by IntelliJ IDEA.
  User: Alin
  Date: 2022/12/6
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>列表查询页面</title>
  </head>

  <%!
      String formatDate(Date date){
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
          return sdf.format(date);//.format()是转化为String类型, .parse()是转化为Date
      }
      //把类型的数字换成类型名
      String getTypeName(Integer typeID){
          if(typeID == 1){
              return "计算机/软件";
          }else if(typeID == 2){
              return  "小说/文稿";
          }else{
              return "杂项";
          }
      }
  %>

  <body>
    <form action="book.html?action=query" method="post" align="center">
        书名:<input type="text" name="bookName"/>
        <input type = "submit" value ="查询"/><br/>
        &nbsp;&nbsp;1.空查询可查找所有图书 <br/>
          2.点击图书名称修改对应图书信息
    </form>

    <a href="bookAdd.jsp">添加新书籍</a> <br/>
    <a href="login.jsp">返回登录</a>    <br/>
    <a href="register.jsp">注册用户</a>
    <table border="1" align="center">
      <tr>
        <%-- th:标题 --%>
        <th>编号</th>
        <th>图书名称</th>
        <th>图书作者</th>
        <th>借阅时间</th>
        <th>书籍分类</th>
        <th>操作</th>
      </tr>
    <%--  数据部分  --%>
      <%
        Object date = request.getAttribute("Date");
        if(date != null){
          //读取数据
          //数据的类型是Object所以要强转成集合类型
          List<Book> list = (List<Book>)date;
          for (Book book : list) {//list集合里每本书都进行循环到book里
        %>
           <tr>
              <td><%=book.getbId()%></td>
              <td><a href="book.html?action=update&id=<%=book.getbId()%>"><%=book.getbName()%></a></td>
              <td><%=book.getbAuthor()%></td>
              <td><%=book.getbTime()%></td>
              <td><%=getTypeName(book.getbType())%></td>
                <%-- 一般这里href是接一个地址的,但这里要用一个javascript的一个函数函数 --%>
              <td><a href="javascript:deleteBook(<%=book.getbId()%>)">删除</a></td>
           </tr>
        <%
          }
        }
      %>
    </table>
  <script src="js/jquery-3.3.1.js"></script>
  <script type="text/javascript">
      function deleteBook(bid) {
          //发送ajax请求,执行删除
          $.ajax({
              "url":"book.html",//url标记的目标,意思是交到servlet里头
              //告诉servlet这是要删除的执行删除判断
              "data":"action=delete&bid="+bid,
              "type":"get",
              "dataType":"text",
              "success":function (result) {//true和false传到result里
                  /*js里没有equals
                  * js里 == 和 === 的区别:
                  * 1. == 判定时之判定值是否相等,若类型不一致,会自动转换.(所以1 == "1"为真)
                  * 2.=== 判定值 和 类型 是否相等 (所以1 ==="1"为假)类型不相等
                  * (1 == ture 为真)--->由于类型自动转换,true为1,false为0*/
                  if(result == "1"){
                      alert("删除成功")
                  }else if (result == "0"){
                      alert("删除失败")
                  }
              }
          });
      }
  </script>
  </body>
</html>
