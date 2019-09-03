package com.day11.object;


class Account2 {
	/*
	 객체(Object) - 물건, 대상
	 객체 지향 프로그래밍(Object Oriented Programming-OOP)
	 - 객체가 하는 행동을 있는 그대로 실체화시켜 프로그래밍 하는 것
	 
	 객체는 상태정보(속성, 데이터)와 행동(기능)으로 구성되어 있다
	 - 상태정보는 변수로 표현
	 - 행동은 매서드로 표현
	 
	 객체를 여러개 만들기 위해서는 객체를 생성하는 틀이 필요함
	 그 틀이 class
	 
	 클래스(class) - 객체를 생성하기 위한 틀로서 상태정보와 행동으로 구성되어 있다
	 
	 class(클래스)				object(객체)
	 -----------------------------------------
	 붕어빵틀						붕어빵
	 제품설계도						제품
	 자동차설계도					자동차
	 -----------------------------------------
	 틀							실체
	  -----------------------------------------
	  
	  클래수 - 멤버변수와 메서드로 구성
	  
	  class 클래스명 {
	  	//멤버변수(필드)
	  	//메서드
	  }
	  */
	
	//은행계좌 클래스
	//나는 은행계좌에서 30000원을 출금했다
	//1. 멤버변수
	String accId; // 계좌번호
	String name; //이름
	int balance; //잔액
	
	//생성자
	/*
	 생성자 - 멤버변수 초기화를 목적으로 하는 메서드
	 		객체가 생성될 때 자동으로 호출되어 가장 먼저 실행하는 메서드
	 		클래스명과 동일
	 		매개변수는 있을 수 있으나 반환타입은 없다
	 		
	 		
	 		기본 생성자는 컴파일러가 자동으로 만들어준다
	 */
	Account2 () {
		
	}
	
	Account2(String p_accId, String p_name, int p_balance) {
		accId = p_accId;
		name = p_name; //이름
		balance = p_balance;
	}
	
	//2. 메서드
	//출금하다
	public void withdraw(int money) {
		balance -= money;
	}
	
	//입금하다
	public void deposit(int money) {
		balance += money;
	}
	
	//출력 메서드
	public void showInfo() {
		System.out.println("계좌번호:" +accId);
		System.out.println("이름:" +name);
		System.out.println("잔액:"+balance+"\n");
	}
	
} //class


public class AccountTest2 {

	public static void main(String[] args) {
		//객체 생성
		//클래스를 사용하기 위해서는 객체를 생성해서 객체를 사용해야 함
		//=>해당 클래스의 멤버변수나 메서드를 호출해서 사용
		
		/*
		 객체를 생성하는 방법
		 클래스명 참조변수 = new 클래스명();
		 예) Account acc = new Account();
		 
		 - 메서드 호출
		 acc.withdraw(3000);
		 
		 - 멤버변수 접근
		 acc.balance=10000;
		 */
		
		//첫번째 객체 생성
		
		Account2 acc = new Account2();
		
		//생성자에 의해 변수 초기화
		Account2 acc2 = new Account2("123-2000-001", "가나다", 400000);
		acc2.showInfo(); //멤버변수는 default값으로 초기화됨
		
		//cf. Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		
		//두번째 객체 생성
		acc2.accId = "100-2000-001";
		acc2.name = "홍길동";
		acc2.balance = 100000;
		
		acc2.withdraw(30000);
		acc2.showInfo();
		
		//멤버변수 값 변경하기
		acc2.balance = 400000;
		acc2.showInfo();
		
	}

}
