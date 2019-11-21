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

@WebServlet("/DetailServ")
public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//
		response.setContentType("text/html;charset=euc-kr");
		
		//
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
		PdDTO dto=null;
		
		try {
			dto=dao.selectByNo(Integer.parseInt(no));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//3
		out.print("<html>");
		out.print("<head><title>상품상세보기-서블릿</title>");
		out.print("<script type='text/javascript'>");
		out.print("function del(){");
		out.print("	if(confirm('삭제하시겠습니까?')){");
		out.print("		location.href='/mystudy/deleteServ?no="+no+"';");
		out.print("	}");
		out.print("}");
		out.print("</script>");		
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>상품 상세보기 - 서블릿</h1>");
		out.print("<p>번호 : "+no+"</p>");
		out.print("<p>상품명 : "+dto.getPdName()+"</p>");
		out.print("<p>가격 : "+dto.getPrice()+"</p>");
		out.print("<p>등록일 : "+dto.getRegdate()+"</p>");		
		out.print("<br><a href='/mystudy/ListServ'>목록</a> | ");
		out.print("<a href='/mystudy/editServ?no="+no+"'>수정</a> | ");
		out.print("<a href='#' onclick='del()'>삭제</a>");		
		out.print("</body>");		
		out.print("</html>");
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
