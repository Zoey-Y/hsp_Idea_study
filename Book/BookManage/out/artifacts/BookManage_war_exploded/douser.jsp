<%@ page import="com.bm.entity.Users" %>
<%@ page import="com.bm.Dao.imp.UserDaoImpl" %>
<%@ page import="com.bm.tools.ResponseUtil" %>
<%@ page import="org.apache.catalina.User" %>
<%@ page import="com.bm.service.UsersService" %><%--
  Created by IntelliJ IDEA.
  User: Alin
  Date: 2022/12/10
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    UsersService usersService = new UsersService();
    //接收表单
    request.setCharacterEncoding("utf-8");
    String action = request.getParameter("action");//接收登录,注册表的 各 模块地址

    if(action.equals("login")){//登录
        //获取登陆页面两个框的数据
        String name = request.getParameter("username");
        String pwd = request.getParameter("password");
        //执行登陆业务
        Users login = usersService.login(name, pwd);
        if (login != null){//在sql表里头可以找到用户信息
            //登录成功跳转到首页
            //request处理完之后数据就没有了,session处理完之后还会保持会话
            session.setAttribute("into",login);//登录之后将用户信息传到首页
            //告诉浏览器重新发一个新的请求(重定向)
            response.sendRedirect("Home.jsp");//重定向跳转到查询页面
        }else{//找不到用户信息
            request.setAttribute("msg","用户名或密码错误");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }

    }else if(action.equals(("register"))){//注册
        //获取数据
        String name = request.getParameter("username");
        String pwd = request.getParameter("password");

        //实例化参数对象(有参构造器已经传参)
        Users users = new Users(0, name, pwd);
        //执行dao操作
        //根据姓名查询表是否重复
        try{//service层抛出异常后这里要接收异常
            boolean result = usersService.register(users);
            if (result){
                request.setAttribute("msg","注册成功");
            }else{
                request.setAttribute("msg","注册失败");
            }
        }catch (Exception e){//若出异常的话执行这里,输出异常内容
            request.setAttribute("msg",e.getMessage());
        }

        //将存储到request里的反馈信息放到register.jsp
        request.getRequestDispatcher("register.jsp").forward(request, response);
    }
%>
</body>
</html>
