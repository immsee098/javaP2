package com.day11.object;


class Account {
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


public class AccountTest {

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
		Account acc = new Account();
		acc.showInfo(); //멤버변수는 default값으로 초기화됨
		
		//cf. Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		
		//두번째 객체 생성
		Account acc2 = new Account();
		acc2.accId = "100-2000-001";
		acc2.name = "홍길동";
		acc2.balance = 100000;
		
		acc2.withdraw(30000);
		acc2.showInfo();
		
	}

}
