package com.day4;

public class LogicalOp {

	public static void main(String[] args) {
		int x =10, y =-7;
		boolean bool = x>0, bool2=y>2;
		boolean result = bool&&bool2;

		System.out.println("x="+x+", y="+y);
		System.out.println("x>0 :" +bool); //true
		System.out.println("y>0 :"+bool2); //false
		System.out.println("x>0 && y>0 :"+result); //false
		System.out.println("x>0 || y>0 :" + (x>0 || y>0)); //true
		System.out.println("!(x>0) :" + !(x>0)); //false
	}

}
