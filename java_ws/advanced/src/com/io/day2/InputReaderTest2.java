package com.io.day2;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputReaderTest2 {

	public static void main(String[] args) {
		InputStreamReader isr=new InputStreamReader(System.in);
		
		System.out.println("ют╥б!!");
		
		try {
			int data=0;
			while((data=isr.read())!=-1) {
				//System.out.println(data);
				System.out.println((char)data);				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
