package com.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/DispatcherServlet")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Properties prop;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		//최초 요청시 한번만 처리
		//매핑 파일을 읽어서 Properties 컬렉션에 저장한다
		String configFile=config.getInitParameter("configFile");
		//=> /config/CommandPro.properties
		System.out.println("매핑파일 위치 : "+ configFile);
		
		//실제 물리적인 위치 구하기
		configFile=config.getServletContext().getRealPath(configFile);
		System.out.println("실제 매핑파일 위치 : "+ configFile);
		
		prop=new Properties();
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(configFile);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requestPro(request, response);
	}


	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		requestPro(request, response);
	}

	private void requestPro(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException{
		//요청이 들어올 때마다 호출
		//=> 담당자(명령어처리 클래스) 구하기
		
		//=> URI로부터 명령어를 추출한 후 Properties 컬렉션을 참조하여
		//명령어에 해당하는 명령어처리 클래스를 구한다
		//명령어 처리 클래스의 메서드를 호출하고 리턴해준 뷰페이지로 포워드한다
		
		//=> URL => http://localhost:9090/mymvc/tips/book.do
		//=> URI => /mymvc/tips/book.do
		//=> 명령어 => /tips/book.do
		//=> 명령어 처리 클래스 => BookController2
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
				
		//         0123456789   
		//URI 구한다  /mymvc/tips/book.do
		String uri=request.getRequestURI();
		System.out.println("\nuri="+uri);
		
		//URI에  ContextPath가 존재하는지 체크
		String ctxPath=request.getContextPath(); //=> /mymvc
		System.out.println("ctxPath="+ctxPath);
		
		String cmd=uri;
		if(uri.indexOf(ctxPath)!=-1) {
			//ContextPath 다음부터 명령어만 추출
			cmd=uri.substring(ctxPath.length()); //=> /tips/book.do
			//cmd=uri.substring(6); 
		}
		System.out.println("명령어 cmd="+cmd);
		
		//Properties 컬렉션을 참조하여 명령어에 해당하는 명령어처리 클래스를 구한다
		String cmdVal=prop.getProperty(cmd);
		//=> BookController2
		System.out.println("명령어 처리 클래스 : "+ cmdVal);
		
		try {
			//String => 클래스로
			Class cmdClass = Class.forName(cmdVal);

			//클래스의 인스턴스 생성
			Controller controller=(Controller) cmdClass.newInstance();
			
			//명령어 처리클래스의 메서드 호출
			String viewPage
				=controller.requestProcess(request, response);
			System.out.println("viewPage="+viewPage+"\n");
			
			//해당 뷰페이지로 포워드
			RequestDispatcher dispatcher
				=request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		
	}
	
}







