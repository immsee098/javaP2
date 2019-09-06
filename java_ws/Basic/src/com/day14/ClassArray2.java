package com.day14;

import java.util.Scanner;

public class ClassArray2 {

	public static void main(String[] args) {
		Account[] accArr=new Account[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<accArr.length; i++) {
			System.out.println("계좌, 잔액, 출금액 입력");
			String accId = sc.nextLine();
			int balance = sc.nextInt();
			int money = sc.nextInt();
			sc.nextLine();
			
			accArr[i] = new Account(accId, balance);
			//출금 매서드 호풀
			accArr[i].withdraw(money);
		}//for
		
		System.out.println("\n==============고객계좌리스트================");
		for(int i =0; i<accArr.length; i++) {
			accArr[i].display();
		}

	}

}
