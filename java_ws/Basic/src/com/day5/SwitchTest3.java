package com.day5;

import java.io.IOException;

public class SwitchTest3 {

	public static void main(String[] args) throws IOException {
		// 성별 구하기
		/*public abstract int read() throws IOException
			- 키보드로부터 char값을 읽어올 때 사용
			- 아스키코드 1바이트를 리턴함
		*/
		System.out.println("성별을 입력하세요(M, F)");
		int code = System.in.read();
		System.out.println("code="+code);
		
		char ch = (char)code;
		System.out.println("ch="+ch);
		
		//abc를 적어도 앞에 a만 리턴함
		
		String result = "";
		switch(ch) {
		    case 'm':
			case 'M':
				result="남";
				break;
				
			case 'f':	
			case 'F':
				result = "여";
				break;
			
			default:
				result="잘못입력";
		}
		System.out.println(ch+"=>"+result);
		
		//public static toUpperCase(char ch)
		char gender = Character.toUpperCase(ch);
		switch(gender) {
		case 'M':
			result = "남자";
			break;
		case 'F':
			result = "여자";
			break;
			
		default:
			result="잘못입력";
		}
		System.out.println(result);

		
	}

}
