package com.day20;

import java.io.IOException;

public class IOExceptionTest {

	public static void main(String[] args) {
		System.out.println("�����̳� ���� �ѱ��� �Է�");
		try {
			int code = System.in.read();
			System.out.println("code="+code+", ����:"+(char)code);
		}catch(IOException e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
		
		System.out.println("\nnext");

	}

}
