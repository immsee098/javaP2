package com.tips.model;

public class MessageModel {
	public String getMessage(String param) {
		String result="";
		
		if(param==null || param.isEmpty()) {
			result="안녕하세요";
		}else if(param.equals("name")) {
			result="홍길동입니다.";
		}else {
			result="잘못된 타입입니다.";
		}
		
		return result;
	}
	
}
