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
		//응답문서에 대한 컨텐츠타입 지정
		response.setContentType("text/html;charset=euc-kr");
		
		PrintWriter out=response.getWriter(); //출력스트림
		
		Date d = new Date();
		
		out.print("<html>");
		out.print("<head><title>서블릿 연습</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>현재일자 : " + d.toLocaleString()+"입니다.");		
		out.print("</h1>");		
		out.print("</body>");		
		out.print("</html>");
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
