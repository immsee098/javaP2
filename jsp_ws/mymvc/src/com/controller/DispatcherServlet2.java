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

public class DispatcherServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Properties prop;
	
	public void init(ServletConfig config) throws ServletException {
		//매핑파일을 읽어서 Properties 컬렉션에 저장한다
		String configFile=config.getInitParameter("configFile");
		System.out.println("configFile="+configFile);
		
		//실제 물리적인 위치 구하기
		configFile
		=config.getServletContext().getRealPath(configFile);
		System.out.println("물리적인 위치:"+ configFile);
		
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(configFile);
			
			prop=new Properties();
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

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		requestPro(request, response);
	}

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		requestPro(request, response);
	}

	private void requestPro(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException{
		//담당자(명령어 처리 클래스) 구해서 일시키기
		//=> URI로부터 명령어를 추출한 후, Properties 컬렉션을 참조하여
		//명령어에 해당하는 명령어 처리 클래스를 구한다
		//명령어 처리 클래스의 메서드를 호출하고 리턴해준 뷰페이지로 redirect하거나
		//forward 한다
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String uri=request.getRequestURI();
		System.out.println("uri="+uri);
		
		String ctxPath=request.getContextPath();
		System.out.println("ctxPath="+ctxPath);
		
		String key=uri;
		if(uri.indexOf(ctxPath)!=-1) {
			key=uri.substring(ctxPath.length());
		}
		System.out.println("key="+key);
		
		//명령어에 해당하는 명령어 처리 클래스 구하기
		String cmdVal=prop.getProperty(key);
		System.out.println("명령어 처리 클래스 ="+ cmdVal);
		
		try {
			Class cmdClass = Class.forName(cmdVal);
			Controller controller=(Controller)cmdClass.newInstance();
			
			String viewPage=controller.requestProcess(request, response);
			System.out.println("viewPage="+viewPage);
			
			if(controller.isRedirect()) {
				System.out.println("redirect\n");
				response.sendRedirect(ctxPath+viewPage);
			}else {
				System.out.println("forward\n");
				RequestDispatcher dispatcher
					=request.getRequestDispatcher(viewPage);
				dispatcher.forward(request, response);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}



