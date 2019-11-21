package com.mystudy.pd.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mystudy.pd.model.PdDAO;
import com.mystudy.pd.model.PdDTO;


//@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=euc-kr");	

		PrintWriter out = response.getWriter();
		
		String no = request.getParameter("no"); 	  	
		if(no==null || no.isEmpty()) {
			out.print("<script type='text/javascript'>");
			out.print("alert('잘못된 url입니다.');");
			out.print("location.href='/mystudy/ListServ';");			
			out.print("</script>");
			
			return;
		}
		
		PdDAO pdDao = new PdDAO();
		PdDTO pdDto = new PdDTO();
		try{
			pdDto = pdDao.selectByNo(Integer.parseInt(no));
		}catch(SQLException e){ 		
			e.printStackTrace();	  	
		}

		out.println("<html><head><title>상품수정-서블릿</title></head><body>");
		out.println("<h1>상품 수정-서블릿</h1>");
		out.println("<form name='frm' method='POST' action='/mystudy/editOkServ'>");
		out.println("<INPUT TYPE='hidden' NAME='no' value='"+no+"'><br>");
		out.println("상품명: <INPUT TYPE='text' NAME='pdName' value='"+pdDto.getPdName()+"'><br>");
		out.println("가격:<INPUT TYPE='text' NAME='price' value='"+pdDto.getPrice()+"'><br><br>");
		out.println("<INPUT TYPE='submit' value='수정'>");		
		out.print("<INPUT TYPE='reset' value='취소'>");
		out.print("</form><br>");
		out.print("<a href='/mystudy/ListServ'>상품목록</a>");
		out.println("</body></html>");	
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
