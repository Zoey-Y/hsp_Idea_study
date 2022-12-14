package com.bm.tools;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*创建目的:封装一个BookServlet中
* 重复使用的弹窗功能*/
public class ResponseUtil {
    public static void alert(HttpServletResponse response,String msg,String url) throws IOException {//没有参数就传一个
        //response是Servlet中doPost和doGet来自Tamcat的参数对象
        //返回成功的提示(不能用Sys了这是返回给控制台的),我们需要返回到页面
        //使用弹窗提示,response:往客户端反馈东西
        response.setCharacterEncoding("utf-8");//设置数据传送到客户端时的编码
        response.setContentType("text/html;charset=utf-8");//告诉浏览器以utf-8解析
        //设置好编码 和 路径,就往里面写内容
        PrintWriter out = response.getWriter();//有异常可以try..catch,也可以直接抛给外面
        out.println("<script type='text/javascript'>");
        out.println("alert('"+msg+"')");//传进来各种不一样的弹窗信息
        //弹窗提示完调转到bookAdd.jsp页面
        out.println("window.location.href='"+url+"'");//跳转到哪个页面也可能不一样
        out.println("</script>");
    }
}
