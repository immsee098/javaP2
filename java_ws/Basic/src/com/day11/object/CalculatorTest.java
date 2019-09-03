package com.day11.object;

import java.util.Scanner;

//멤버변수 없이 메서드 4개

class Calculator {
	public float add (float a, float b) {
		return a+b;
	}
	
	public float minus (float a, float b) {
		return a-b;
	}
	
	public float multiple (float a, float b) {
		return a*b;
	}
	
	public float divide (float a, float b) {
		return a/b;
	}
}

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		Calculator c1 = new Calculator();
		System.out.println(c1.add(a, b));

	}

}
