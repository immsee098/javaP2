package com.io.day2;

import java.io.IOException;

public class InputReaderTest1 {

	public static void main(String[] args) {
		//Ű����κ��� �Է¹ޱ�
		System.out.println("�Է��ϼ���"); // \r\n =>13 10
		
		try {
			int data=0;
			while((data=System.in.read())!=-1) {
				//System.out.println(data);
				System.out.println((char)data);				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				System.in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
