package com.day5;

public class SwitchTest {

	public static void main(String[] args) {
		int n =2;
		String result = "";
		
		if (n==1) {
			result = "one";
		} else if (n==2) {
			result = "two";
		} else if (n==3) {
			result = "three";
		} else {
			result = "나머지 수";
		}
		
		System.out.println(n+"=>"+result);
		
		/*
		 *switch문 - 주로 조건이 여러개인 경우 사용
		 			단, == 비교인 경우만 사용 가능
		 			>, < 대소비교인 경우는 불가능
		 			
		 switch(제어변수) {
		 	case 값1:
		 		문장1;
		 		break;
		 	case 값2:
		 		문장2;
		 		break;
		 	default:
		 		문장3;<<이건 없어도 되고 아니어도 되고
		 		
		 제어변수가 값1과 같으면 문장1을 실행, 그렇지 않고 값 2와 같으면 문장 2 실행.... 쭉죽 내려감
		 
		 제어변수는 byte, short, int, char만 가능
		 JDK 7.0 이상에서는 String도 가능
		 
		 case 다음에 나오는 값은 상수만 가능, 변수나 비교연산 불가
		 {}는 switch에 쓰고, case에는 쓰지 않는다
		 대신 case문에는 반드시 break가 있어야 한다
		 break - 해당 case문 탈출
		 }
		*/
		
		switch(n) {
			case 1:
				result = "one";
				break;
			case 2:
				result = "two";
				break;
			default:
				result = "other";
				break;
		}
		
		System.out.println(result);
	}

}
