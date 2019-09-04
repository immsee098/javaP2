package com.day12;


class AAA {
	
	/*
	 ~제한 접근자~
	 1) private - 같 클래서 내에서만
	 2) default - 같패키지
	 3) protected - 패키지가 달라도 같 상속이라면 가능
	 4) public - 어디서나
	 
	 private<defalt<protected<public
	 */
	
	private int age;
	String name;
	//protected address2;
	String num;
	
	public void showInfo() {
		System.out.println(age);
		System.out.println(name);
	}
}

public class PrivateTest {

	public static void main(String[] args) {
		// obj.age = 20 ~> 에러. private이무로 접근불가
		//System.out.println(); ~>가능
		
		BBB b = new BBB();

	}

}
