package com.bm.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *处理登录请求
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8"); 
		response.setCharacterEncoding("UTF-8");
		
		String code = request.getParameter("checkCode");
		HttpSession session = request.getSession();
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		if(name.equals("user")&&pwd.equals("123"))
		{
		if (!code.equalsIgnoreCase((String) session.getAttribute("randCheckCode"))) {
			request.setAttribute("errormsg", "验证码不正确");
			response.getWriter().println("<script> type='text/javascript'>window.alert('*验证码错误！');window.location.href='login.jsp'</script>");
		}else {
		response.getWriter().println("<script> type='text/javascript'>window.alert('*用户登录成功！');window.location.href='login.jsp'</script>");
		response.sendRedirect("yonghu.jsp");}
	}else if(name.equals("admin")&&pwd.equals("123"))
		{
		if (!code.equalsIgnoreCase((String) session.getAttribute("randCheckCode"))) {
			request.setAttribute("errormsg", "验证码不正确");
			response.getWriter().println("<script> type='text/javascript'>window.alert('*验证码错误！');window.location.href='login.jsp'</script>");
		}else {
		response.getWriter().println("<script> type='text/javascript'>window.alert('*用户登录成功！');window.location.href='login.jsp'</script>");
		response.sendRedirect("guanli.jsp");}
	}else	
		{response.getWriter().println("<script> type='text/javascript'>window.alert('*账号密码错误！');window.location.href='login.jsp'</script>");}
		}
	   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}