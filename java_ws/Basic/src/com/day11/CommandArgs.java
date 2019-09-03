package com.day11;

public class CommandArgs {

	public static void main(String[] args) {
		// 명령줄 인수
		/*
		 프로그램을 실행할 때 클래스이름 뒤에 공백문자로 구분하여 여러 개의 문자열을 프로그램에 전달 할 수 있음  
		 예) d:>java MainTest hong 123  
		 커맨드라인을 통해 입력된 두 문자열은 String배열에 담겨서 MainTest 클래스의 main메서드의 매개변수(args)에 전달됨  
		 main 메서드 내에서 args[0], args[1]과 같은 방식으로 전달받은 문자열에 접근할 수 있음

		 */
		
		System.out.println("매개변수 args의 크기: "+args.length);
		if(args.length<2) {
			System.out.println("매개변수를 2개 입력하세요!");
			return;
		}
		
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		
		System.out.println(name);
		System.out.println(age);

	}

}
