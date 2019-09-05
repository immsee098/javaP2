package com.day13;

class AAA {
	static int[] arr = new int[10]; //명시적 초기화
	//=> 명시적 초기화를 이용해 정수 10개를 갖는 배열 생성
	
	//static 초기화 블럭 - static 변수의 복잡한 초기화에 사용됨
	//=> 해당 클래스가 메모리에 로딩될 때 static 변수가 생성되고, static 초기화 블럭 호출
	//=> 첨에 한 번만 호출
	
	static {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
		}//for
	}
}

public class StaticBlock {

	public static void main(String[] args) {
		System.out.println("static 배열의 길이 : "+AAA.arr.length);
		
		for(int i=0; i<AAA.arr.length;i++) {
			System.out.println(AAA.arr[i]);
		}

	}

}
