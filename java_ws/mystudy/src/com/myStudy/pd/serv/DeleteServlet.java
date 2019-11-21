package com.mystudy.pd.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mystudy.pd.model.PdDAO;

//@WebServlet("/DeleteServ")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//=> 응답문서에 대한 컨텐츠 타입 지정
		response.setContentType("text/html;charset=euc-kr");

		//=> 출력스트림 생성
		PrintWriter out=response.getWriter();

		//1
		String no=request.getParameter("no");
		if(no==null || no.isEmpty()) {
			out.print("<script type='text/javascript'>");
			out.print("alert('잘못된 url입니다.');");
			out.print("location.href='/mystudy/ListServ';");			
			out.print("</script>");
			
			return;
		}
		
		//2
		PdDAO dao=new PdDAO();
		try {
			int cnt=dao.deletePd(Integer.parseInt(no));

			//3
			if(cnt>0) {
				response.sendRedirect("/mystudy/ListServ");
			}else {
				System.out.println("상품삭제 실패!!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
