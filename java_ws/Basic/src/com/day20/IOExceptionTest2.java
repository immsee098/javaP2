package com.day20;

import java.io.IOException;

public class IOExceptionTest2 {

	public static void main(String[] args) throws IOException {
		System.out.println("�����̳� ���� �ѱ��� �Է�");
		int code = System.in.read();
		System.out.println("code="+code+", ����:"+(char)code);
		
		System.out.println("\nnext");

	}

}
