package com.day22;

public class StringTest {

	public static void main(String[] args) {
		String str = "Hellow java, Hi java!";
		
		char ch = str.charAt(4);
		System.out.println("index 4 위치의 문자:"+ch);
		
		int idx = str.indexOf("java");// 없으면 -1리턴
		System.out.println("앞에서부터 찾은 자바의 위치"+idx);
		System.out.println("뒤에서부터 찾은 자바의위치"+str.lastIndexOf("java"));
		
		idx = str.indexOf("1");
		System.out.println("1의 위치"+idx);
		
		String sub = str.substring(12, 14);
		System.out.println("12~13까지 문자열 추출:"+sub);
		
		System.out.println("15부터 끝까지 문자열 추출:"+str.substring(15));
		
		str="www.nate.com";
		if(str.startsWith("www")){
			System.out.println("www로 시작함!");
		}
		
		if(str.endsWith("com")) {
			System.out.println("com으로 끝남");
		}
		
		String email = "hong@email.com";
		
		if(email.indexOf("@")!= -1 &&email.indexOf(".")!=-1 &&email.indexOf("@")<email.indexOf(".")) {
			System.out.println("유효한 이메일입니다.");
		} else {
			System.out.println("유효하지 않은 이메일입니다");
		}
		
		
		//kim@hanmail.net
		String email1 = "kim@hanmail.net";
		//hong만 추출
		int a = email1.indexOf("@");
		int b = email1.indexOf(".");
		System.out.println(email1.substring(0, a));
		
		//gmail만 추출
		
		System.out.println(email1.substring(a+1,b));
		
		//com만 추출
		System.out.println(email1.substring(b+1));
		
		
		String s = "    java,      android     ";
		System.out.println("\n["+s+"]");
		System.out.println("문자열의 길이:"+s.length());
		String s2 = s.trim();
		System.out.println("\n["+s2+"]");
		System.out.println("공백 제거 후 길이:"+s2.length());
		
		int n = 10;
		double d = 3.14;
		
		System.out.println("\n숫자의 합:"+(n+d));
		
		String ss1 = String.valueOf(n);
		String ss2 = Double.toString(d);
		
		System.out.println(ss1+ss2);
	}

}
