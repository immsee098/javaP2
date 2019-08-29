package com.day8;

public class MethodTest2 {
	/*
	 접근 제한자 반환타입 메서드 이름(매개변수) {
	 	메서드 내용
	 	return 결과값;
	 }
	 
	 입력값 - 매개변수, 인수, 인자, 파라미터
	 결과값의 타입 - 반환형, 반환타입(리턴타입)
	 */
	public static double calcInterest(int money) {
		double interest = money*0.016;
		return interest;
		
	}

	public static void main(String[] args) {
		int m =10000;
		double d = calcInterest(m);
		System.out.println(d);
		/*
		 메서드 호출
			[1] static메서드 호출
				클래스명.메서드명();
				단, 같은 클래스에 있는 메서드를 호출할 때는 클래스명 생략 가능
				메서드명()
				
			[2] instance메서드 호출(static이 안 붙음)
				참조변수.메서드명();
		 */
	}

}
