package com.java0919;

class FinallyTest{	
	public static void main(String[] args){
		boolean divOK=divider(4, 2);
		if(divOK)
			System.out.println("���� ����\n");
		else
			System.out.println("���� ����\n");
		
		divOK=divider(4, 0);
		if(divOK)
			System.out.println("���� ����\n");
		else
			System.out.println("���� ����\n");
	}	

	public static boolean divider(int num1, int num2)	{
		try{
			int result=num1/num2;
			System.out.println("������ ����� "+result);
			return true;
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			return false;
		}
		finally{
			System.out.println("finally ���� ����");
		}
	}
}