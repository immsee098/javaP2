package com.mystudy.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PostServ")
public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//=> ���乮���� ���� ������ Ÿ�� ����
		response.setContentType("text/html;charset=euc-kr");
		
		//=> ��½�Ʈ�� ����
		PrintWriter out=response.getWriter();
		
		//1.
		//post
		request.setCharacterEncoding("euc-kr");
		
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		
		//2		
		//3
		out.print("<html>");
		out.print("<head><title>post����</title></head>");
		out.print("<body>");
		out.print("<h1>post��� - ����</h1>");
		out.print("<p>�̸� : "+ name+"</p>");
		out.print("<p>��й�ȣ : "+ pwd+"</p>");		
		out.print("</body>");		
		out.print("</html>");
		
		out.close();
	}

}
