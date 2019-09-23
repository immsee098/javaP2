package com.day23;

public class ConcatTest {

	public static void main(String[] args) {
		// String클래스의 concat()매서드 - 문자열 결합
		
		String str = "java";
		String s = str.concat(" and").concat(" oracle").concat(" aa");
		
		System.out.println("s="+s);
		//s = str+" and"+" oracle"; //string builder임 +연산을 하면 자동으로 스트링빌더됨
		String s2 = str+ " bbb";
		
		System.out.println("s2="+s2);

	}

}
