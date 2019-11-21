package com.mystudy.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NowServ")
public class NowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���乮���� ���� ������Ÿ�� ����
		response.setContentType("text/html;charset=euc-kr");
		
		PrintWriter out=response.getWriter(); //��½�Ʈ��
		
		Date d = new Date();
		
		out.print("<html>");
		out.print("<head><title>���� ����</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>�������� : " + d.toLocaleString()+"�Դϴ�.");		
		out.print("</h1>");		
		out.print("</body>");		
		out.print("</html>");
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
