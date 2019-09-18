package com.day20;

import java.io.IOException;

public class IOExceptionTest {

	public static void main(String[] args) {
		System.out.println("영문이나 숫자 한글자 입력");
		try {
			int code = System.in.read();
			System.out.println("code="+code+", 문자:"+(char)code);
		}catch(IOException e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		
		System.out.println("\nnext");

	}

}
