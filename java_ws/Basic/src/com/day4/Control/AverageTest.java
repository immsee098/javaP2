package com.day4.Control;

import java.util.Scanner;

public class AverageTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("평균을 입력하세요.");
		float mygrade = sc.nextFloat();
		String result = "";
		
		if(mygrade>=90) {
			result="A";
		} else if (mygrade>=80) {
			result="B";
		} else if(mygrade>=70) {
			result="C";
		} else if(mygrade>=50) {
			result="D";
		} else {
			result ="F";
		}
		System.out.println("평균 : " + mygrade);
		System.out.println("학점 : " + result);
		
		
		if(mygrade>100) {
			result="잘못입력";
		}else if(mygrade>=90) {
			result="A";
		} else if (mygrade>=80) {
			result="B";
		} else if(mygrade>=70) {
			result="C";
		} else if(mygrade>=50) {
			result="D";
		} else if(mygrade>0) {
			result ="F";
		} else {
			result="잘못입력";
		}
		System.out.println("평균 : " + mygrade);
		System.out.println("학점 : " + result);


	}

}
