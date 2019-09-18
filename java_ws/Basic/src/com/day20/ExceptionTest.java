package com.day20;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			arr[0] = 10;
			arr[3] = 50;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		
		try {
			Object obj = new int[3];
			String s = (String)obj;
		} catch(ClassCastException e) {
			System.out.println("예외:"+e);
		}
		
		
		try {
			int[] arr = new int[-4];
		} catch(NegativeArraySizeException e) {
			e.printStackTrace();
		}
		
		
		try {
			String s = null;
			int len = s.length();
		} catch(NullPointerException e) {
			System.out.println("[예외발생]"+e);
		}

	}

}
