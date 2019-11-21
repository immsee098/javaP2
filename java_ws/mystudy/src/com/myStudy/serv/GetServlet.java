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
		
		//서블릿 => 응답문서에 대한 컨텐츠 타입 지정
		response.setContentType("text/html;charset=euc-kr");
		
		//=> 출력스트림 생성
		PrintWriter out=response.getWriter();
				
		//1.요청 파라미터 읽어오기
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		
		//2
		
		//3.
		out.print("<html>");
		out.print("<head><title>get서블릿</title></head>");
		out.print("<body>");
		out.print("<h1>get방식 - 서블릿</h1>");
		out.print("<p>이름 - "+ name+"</p>");
		out.print("<p>비밀번호 - "+ pwd+"</p>");		
		out.print("</body>");		
		out.print("</html>");
		
		out.close();
	}

}







