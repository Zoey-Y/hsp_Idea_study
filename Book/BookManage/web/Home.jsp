<%@ page import="com.bm.entity.Users" %><%--
  Created by IntelliJ IDEA.
  User: Alin
  Date: 2022/12/11
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户首页</title>
</head>
<body>
<%
    Object user = session.getAttribute("into");
    if (user == null){//没有登录
        response.sendRedirect("login.jsp");
    }else{
        Users loginUser = (Users)user;
        out.print("当前登录用户:"+ loginUser.getName());
    }
%>

<br/>
<a href="index.jsp">查询页面</a> <br/>
<a href="bookAdd.jsp">添加书籍</a> <br/>
<a href="login.jsp">返回登陆页面</a>
</body>
</html>
