package com.day20;

import java.util.*;

public class MultiCatch {

	public static void main(String[] args) {
		/*
		 *	���� catch��
		 *	-������ ������ ���� catch���� ���� �� ���
		 *	-������ ������ ���� ���� �ٸ� ó���� �� �� �ִ�
		 *
		 *	catch�� ������ �ݵ�� �ڽĺ��� �θ������ �ؾ���(�׿ܿ� ����)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("���� �Է�");
			int n = sc.nextInt();
					
			int res = 100/n;
			System.out.println("res="+res);
		} catch(ArithmeticException e) {
			System.out.println("����-�߸��� ����:"+e.getMessage());
		} catch(InputMismatchException e) {
			System.out.println("����-�Է¿���:"+e);
		} catch(Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
			e.printStackTrace();
		}

	}

}
