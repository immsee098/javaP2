package com.java0919;

import java.util.Scanner;
class DivideByZero
{	
	public static void main(String[] args)
	{
		System.out.print("�� ����  ���� �Է�: ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
			
		try
		{
			System.out.println("������ ����� ��: "+(num1/num2));  //
		}
		catch(ArithmeticException e)  //
		{
			System.out.println("������ �Ұ���");
			System.out.println(e.getMessage());
		}
		
		System.out.println("���α׷��� �����մϴ�.");  //

	}
}