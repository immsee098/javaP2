package com.day4;
import java.util.*;

public class OpPrac {

	public static void main(String[] args) {
		int num = 45;
		String ver = (num>0) ? "曄熱" : "擠熱";
		System.out.println("num="+num + "=>" + ver );
		
		int num2 = 3;
		String ver2 = (num2%2 == 0) ? "礎熱" : "�汝�";
		System.out.println("num="+num2+"=>"+ver2);
		
		Scanner sc = new Scanner(System.in);  
		int number = sc.nextInt();
		String ver3 = (number%2 == 0) ? "礎熱" : "�汝�";
		System.out.println("num="+number+"=>"+ver3);		
		

	}

}
