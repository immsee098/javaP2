package com.mystudy.pd.serv;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mystudy.pd.model.PdDAO;
import com.mystudy.pd.model.PdDTO;

//@WebServlet("/EditOkServlet")
public class EditOkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=euc-kr");
		
		request.setCharacterEncoding("euc-kr"); 

		String pdname = request.getParameter("pdName"); //상품명
		String price = request.getParameter("price"); //가격
		String no = request.getParameter("no");	  
		
		PdDAO pdDao = new PdDAO();
		PdDTO dto = new PdDTO();
		dto.setNo(Integer.parseInt(no));
		dto.setPdName(pdname);
		dto.setPrice(Integer.parseInt(price));
		try {
			int result = pdDao.updatePd(dto);
			if(result>0){
				response.sendRedirect("/mystudy/DetailServ?no="+no);
			}else{
				System.out.println("상품 update 실패!!");      
			}			
		} catch (SQLException e) {	
			e.printStackTrace();   	
		}
	}

}
