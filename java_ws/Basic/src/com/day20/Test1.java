package com.day20;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("두 실수 입력");
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				System.out.println("연산 결과:"+(n1+n2));
			} catch(Exception e) {
				e.printStackTrace();
				continue;
			}
		}

	}

}
