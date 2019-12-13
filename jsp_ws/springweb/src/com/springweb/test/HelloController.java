package com.springweb.test;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		//1. 파라미터 읽어오기
		
		//2. 비즈니스 로직 처리 - db작업
		String res=getGreeting();
		
		//3. 결과/뷰페이지 저장, 리턴
		ModelAndView mav = new ModelAndView();
		mav.addObject("result",res);
		mav.setViewName("test/hello");
		//=> 논리적 뷰이름 지정
		//=> viewResolver에서 지정한 접두사인 /WEB-INF/views/를 앞에 붙이고
		//접미사인 .jsp를 뒤에 붙여서 실제 물리적인 뷰 페이지가 완성된다
		//=> /WEB-INF/views/ + test/hello + .jsp
		//=> /WEB-INF/views/test/hello.jsp
		
		return mav;
	}
	
	public String getGreeting() {
		Calendar cal=Calendar.getInstance();
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		
		String result="";
		if(hour>=6 && hour<=10) {
			result="좋은 아침입니다.";
		}else if(hour>=12 && hour<=15) {
			result="점심식사는 하셨나요";
		}else if(hour>=19 && hour<=21) {
			result="좋은 밤 되세요";
		}else {
			result="안녕하세요";
		}
		
		return result;
	}

}





