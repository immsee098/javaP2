package com.tips.model;

public class BookExpert {
	public String getTip(String lang) {
		String result="";
		
		switch(lang) {
			case "java":
				result="이것이 자바다";
				break;
			case "jsp":
				result="jsp 웹 프로그래밍";
				break;
			case "c":
				result="시작하세요 c";
				break;
			case "oracle":
				result="뇌를 자극하는 oracle";
				break;				
		}
		return result;
	}
}
