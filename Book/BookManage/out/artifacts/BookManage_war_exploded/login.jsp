<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<title>图书管理系统</title>
<style>
		body {text-align: center;} table {margin: auto;}
        body {
            background-image: url("images/123.jpg");
            background-repeat: no-repeat;
            background-size: 100% 100%;
            background-attachment: fixed;      /*图片铺满整个页面*/
        	  }        
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
 
<script type="text/javascript">
  function myReload() {
    document.getElementById("CreateCheckCode").src = 
    	document.getElementById("CreateCheckCode").src+ "?nocache=" + new Date().getTime();
  }
</script>
</style>
</head>
<body>
  <form action="douser.jsp?action=login" method="post">
      <p class="font tdheight">
       <h2>欢迎访问图书管理系统</h2>
            用户名: <input type="text", name="username"><br>    <!--输入的用户名保存到username变量，传回后端-->
            密&nbsp;&nbsp;&nbsp;码: <input type="password", name="password"><br>
        验证码：<input type="text" name="checkCode" style="width:80px;height:30px;"> 
        <img src="pictureCheckCode" id="CreateCheckCode" align="middle" style="margin-top:-10px;"> <br> 
        
        <a href="" οnclick="myReload()" style="font-size:16px;color:red;margin-left:156px;">看不清,换一个</a>
      
      <br><input type="submit" value="登录"
            class="font" style="width:80px;height:30px;font-size:16px;background:#f55e75">
     	<a href="register.jsp" class="btn btn-success btn-sm">没有账号，注册</a>
   </p>
    </form>
    <a href="register.jsp">注册用户</a>
  <%
      //接收处理结果(放数据给request就是setAttribute)
      Object msg = request.getAttribute("msg");
      if (msg != null){ //说明douser转发过来的
          out.print(msg);
      }
  %>
</body>
</html>