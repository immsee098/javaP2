package com.day24;

import java.util.Scanner; //��Ű���� ����

import static java.lang.System.out;
import static java.lang.Math.PI;
import static java.lang.Math.random;
//=>static ����� ȣ���� �� Ŭ������ ��������

public class StaticImport {

	public static void main(String[] args) {
		System.out.println("random : "+Math.random());
		System.out.println("PI : "+Math.PI);
		
		
		System.out.println("random : "+random());
		System.out.println("PI : "+ PI);
	}

}
