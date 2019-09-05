package com.day13;

/*
 [1] static 변수의 초기화 시점
 	해당 클래스가 메모리에 로딩될 때 단 한 번 초기화됨
 [2] 인스턴스 변수의 초기화 시점
 	인스턴스가 생성될 때마다 각 인스턴스 별로 따로 인스턴스 변수가 생성되고 초기화됨
 	
 * 초기화 순서
 [1] static 변수
 default값 => 명시적 초기화 => static초기화 블럭
 
 [2] instance 변수
 default값=> 명시적 초기화 => 인스턴스 초기화 블럭 => 생성자
 */

class BBB{
	static int cv =1; //static 변수
	int iv = 10; //인스턴스 변수
	
	//static 초기화 블럭
	static {
		cv =2 ;
		System.out.println("static 초기화 블럭 호출 " + cv);
	}
	
	//인스턴스초기화 블럭
	{
		iv = 20;
		System.out.println("인스턴스 초기화 블럭 호출 " +iv);
	}
	
	BBB(){
		iv=30;
		System.out.println("생성자 호출 " + iv);
	}
	
}

public class InitVariable {

	public static void main(String[] args) {
		System.out.println("main 시작");
		System.out.println("BBB의 static 변수 cv="+BBB.cv);
		
		BBB b = new BBB();
		System.out.println("main - 인스턴스 변수 iv="+b.iv);

	}

}
