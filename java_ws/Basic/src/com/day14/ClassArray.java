package com.day14;

public class ClassArray {

	public static void main(String[] args) {
		//3개 요소를 갖는 int배열 선언, 초기화, 출력
		int[] arr;
		arr = new int[3];
		for(int n : arr) {
			System.out.println(n);
		}
		String[] arr1 = {"a", "b", "c", "d"};
		for(String n1 : arr1) {
			System.out.println(n1);
		}
		
		//클래스 배열
		int a = 10;
		int[] arr2 = new int[3];
		arr2[0] = 10;
		arr2[1] = 20;
		
		//
		Account acc = new Account("1000-02-3000", 100000); //변수-객체 저장
		acc.display();
		
		
		Account[] accList = new Account[3];
		accList[0] = new Account("2000-03-44000", 200000);
		accList[1] = new Account("3000-04-50000", 120000);
		Account acc3 = new Account("3000-04-50000", 420000);
		accList[2] = acc3; //배열요소가 추가로 들감
		
		accList[1].display();
		
		for(Account n: accList) {
			n.display();
		}
	}

}
