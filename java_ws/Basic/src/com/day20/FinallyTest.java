package com.day20;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		/*
		 * finally
		 * -���ܹ߻����ο� ������� �ݵ�� ����Ǿ�� �ϴ� ������ �ִ´�
		 * -���ܰ� �߻��ϰ� �߻����� �ʰ� finally���� �ݵ�� �����
		 * 
		 * try{
		 * }catch(Exception e){
		 * }finally{
		 * }
		 */
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("�����Է�");
			int n = sc.nextInt();
			System.out.println("100/"+n+"="+100/n);
			}catch(Exception e){
				System.out.println("���ܹ߻�:"+e);
			}finally{
				System.out.println("�ݵ�� ����Ǿ�� �մϴ�");
			}
		
		System.out.println("\n=====next=====");

	}

}
