<%@ page import="com.bm.entity.Book" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Alin
  Date: 2022/12/8
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改图书</title>
</head>
<%!
    String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);//.format()是转化为String类型, .parse()是转化为Date
    }
%>
<body>
<%--读取Book对象里所有内容,存放到相应属性--%>
<%
    Object bookObject = request.getAttribute("book");
    Book book = (Book) bookObject;
%>
<form action="book.html?action=doUpdate" method="post" align="center">
    <h>修改图书</h>
    <p><%--id不修改,也需要把id传回去--%>
        图书编号:<%=book.getbId()%>
        <%-- hidden:不会显示在浏览器中,但要完成某些数据的提交就需要它 --%>
        <input type="hidden" name="bookId" value="<%=book.getbId()%>"/>
    </p>
    <%-- 文本框里想要一个数据的话加value属性 --%>
    <p>图书名称:<input type="text" name="bookName" value="<%=book.getbName()%>"/></p>
    <p>图书作者:<input type="text" name="bookAuthor" value="<%=book.getbAuthor()%>"/></p>
    <p>借阅时间:<input type="text" name="bookTime" value="<%=formatDate(book.getbTime())%>"/></p>
    <p>
        图书类别:
        <%-- 下拉框的标签 --%>
        <select name="bookType"><%--起了名字才能传到后台--%>
            <%-- 下拉框里面的选项标签 --%>
            <%--传到后台的都是value值,用户选的是汉字,selected作用:可被选中--%>
            <option value="0">请选择分类</option>
            <option value="1" <%if (book.getbType()==1){%>selected<%}%>>计算机/软件类</option>
            <option value="2" <%if (book.getbType()==2){%>selected<%}%>>小说/文摘</option>
            <option value="3" <%if (book.getbType()==3){%>selected<%}%>>杂项</option>
        </select>
    </p>
    <p><input type="submit" value="修改"/></p>
        <%
        //获取request里的msg,显示
        Object msg = request.getAttribute("msg");
        if (msg!=null){//为空说明直接打开modify页面了
            out.println(msg.toString());
        }
    %>
</body>
</html>
