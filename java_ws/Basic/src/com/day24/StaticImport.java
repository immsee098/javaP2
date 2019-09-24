package com.day24;

import java.util.Scanner; //패키지명 생략

import static java.lang.System.out;
import static java.lang.Math.PI;
import static java.lang.Math.random;
//=>static 멤버를 호출할 때 클래스명 생략가능

public class StaticImport {

	public static void main(String[] args) {
		System.out.println("random : "+Math.random());
		System.out.println("PI : "+Math.PI);
		
		
		System.out.println("random : "+random());
		System.out.println("PI : "+ PI);
	}

}
