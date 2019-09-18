package com.day20;

import java.io.IOException;

public class IOExceptionTest2 {

	public static void main(String[] args) throws IOException {
		System.out.println("영문이나 숫자 한글자 입력");
		int code = System.in.read();
		System.out.println("code="+code+", 문자:"+(char)code);
		
		System.out.println("\nnext");

	}

}
