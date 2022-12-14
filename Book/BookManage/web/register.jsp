<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.bm.tools.ResponseUtil" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户注册</title>
<style>
		body {text-align: center;} table {margin: auto;}
        body {
            background-image: url("images/2.jpg");
            background-repeat: no-repeat;
            background-size: 100% 100%;
            background-attachment: fixed;      /*图片铺满整个页面*/
        }
    </style>
</head>
<body>
 <form id="form1" name="form1" action="douser.jsp?action=register" method="post"  >
       <h2>欢迎注册</h2>
            用户名: <input type="text", name="username"><br>   
            密&nbsp;&nbsp;&nbsp;码: <input type="password", name="password"><br>
     	<input type="submit" value="注册"
            class="font" style="width:130px;height:30px;font-size:16px;background:#f19e28">
        <%
            //接收处理结果(放数据给request就是setAttribute)
            Object msg = request.getAttribute("msg");
            if (msg != null){ //说明douser转发过来的
                out.print(msg);
            }
        %>
     <a href="login.jsp">返回登录</a>
 </form>
</body>
</html>