package com.day5;

public class SwitchTest4 {

	public static void main(String[] args) {
		//학점 구하기
		double avg = 85.7d;
		String result = "";
		
		switch((int)avg/10) {
			case 10:
			case 9:
				result="A";
				break;
			case 8:
				result="B";
				break;
			case 7:
				result="C";
				break;
			case 6:
				result="D";
				break;
			default:
				result="F";
		}
		System.out.println("학점 : "+result);

	}

}
