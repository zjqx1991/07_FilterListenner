/**
 * 
 */
package com.revanwang.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Desc 	
 * @author Revan Wang
 *
 * @Date Jul 17, 20197:29:31 PM
 */
@WebServlet("/f")
public class FilterDemoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1、获取请求参数
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		System.out.println(name + password);
		//2、处理业务
		req.setAttribute("name", name);
		req.setAttribute("password", password);
		//3、跳转界面
		req.getRequestDispatcher("/WEB-INF/system.jsp");
	}

}
