package com.mystudy.pd.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mystudy.pd.model.PdDAO;
import com.mystudy.pd.model.PdDTO;

@WebServlet("/WriteServ")
public class WriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//=> 응답문서에 대한 컨텐츠 타입 지정
		response.setContentType("text/html;charset=euc-kr");
		
		//=> 출력스트림 생성
		PrintWriter out=response.getWriter();
		
		//1
		//post
		request.setCharacterEncoding("euc-kr");
		String pdName=request.getParameter("pdName");
		String price=request.getParameter("price");
		
		//2
		PdDAO dao=new PdDAO();
		PdDTO dto=new PdDTO();
		dto.setPdName(pdName);
		dto.setPrice(Integer.parseInt(price));
		
		try {
			int cnt=dao.insertPd(dto);
			
			//3
			if(cnt>0) {
				response.sendRedirect("/mystudy/ListServ");
			}else {
				System.out.println("상품등록 실패!!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}




