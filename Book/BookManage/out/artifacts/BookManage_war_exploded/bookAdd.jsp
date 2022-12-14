<%--
  Created by IntelliJ IDEA.
  User: Alin
  Date: 2022/12/7
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加图书</title>
</head>
<body>
<a href="index.jsp">列表查询</a>
<%--新增图书信息
    1.图书名称
    2.图书作者
    3.借阅时间
    4.图书类别 (下拉框的形式)--%>
    <form action="book.html?action=add" method="post" align="center">
        <h>添加图书</h>
        <%--来自BookServlet的访问路径,
        要想从前端提交(post)到后台的访问路径
        标记一下请求传到servlet后做添加处理--%>
        <p>图书名称:<input type="text" name="bookName"/></p>
        <p>图书作者:<input type="text" name="bookAuthor"/></p>
        <p>借阅时间:<input type="text" name="bookTime"/></p>
        <p>
            图书类别:
            <%-- 下拉框的标签 --%>
            <select name="bookType"><%--起了名字才能传到后台--%>
                <%-- 下拉框里面的选项标签 --%>
                <%--传到后台的都是value值,用户选的是汉字--%>
                <option value="0">请选择分类</option>
                <option value="1">计算机/软件类</option>
                <option value="2">小说/文摘</option>
                <option value="3">杂项</option>
            </select>
        </p>
        <%--添加按钮 此处的value是用户可见的--%>
        <p><input type="submit" value="添加"/></p>
        <%--点击添加就要调到后台,要用到servlet了--%>
    </form>
</body>
</html>
