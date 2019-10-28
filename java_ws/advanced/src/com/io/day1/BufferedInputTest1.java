package com.io.day1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream("text/poetry2.txt");
			bis = new BufferedInputStream(fis);
			
			int data = 0;
			while((data=bis.read())!=-1) {
				System.out.print((char)data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null) bis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
