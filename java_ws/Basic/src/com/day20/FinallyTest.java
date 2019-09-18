package com.day20;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		/*
		 * finally
		 * -예외발생여부에 상관없이 반드시 실행되어야 하는 구문을 넣는다
		 * -예외가 발생하건 발생하지 않건 finally절은 반드시 실행됨
		 * 
		 * try{
		 * }catch(Exception e){
		 * }finally{
		 * }
		 */
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("정수입력");
			int n = sc.nextInt();
			System.out.println("100/"+n+"="+100/n);
			}catch(Exception e){
				System.out.println("예외발생:"+e);
			}finally{
				System.out.println("반드시 실행되어야 합니다");
			}
		
		System.out.println("\n=====next=====");

	}

}
