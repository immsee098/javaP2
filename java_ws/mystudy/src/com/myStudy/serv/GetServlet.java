package com.mystudy.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GetServ")
public class GetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		//=> http://localhost:9090/mystudy/GetServ
		
		//���� => ���乮���� ���� ������ Ÿ�� ����
		response.setContentType("text/html;charset=euc-kr");
		
		//=> ��½�Ʈ�� ����
		PrintWriter out=response.getWriter();
				
		//1.��û �Ķ���� �о����
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		
		//2
		
		//3.
		out.print("<html>");
		out.print("<head><title>get����</title></head>");
		out.print("<body>");
		out.print("<h1>get��� - ����</h1>");
		out.print("<p>�̸� - "+ name+"</p>");
		out.print("<p>��й�ȣ - "+ pwd+"</p>");		
		out.print("</body>");		
		out.print("</html>");
		
		out.close();
	}

}







