package com.io.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputTest1 {

	public static void main(String[] args) {
		//파일에서 읽어서 파일에 저장
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("text/poetry2.txt");
			//fos = new FileOutputStream("text/poetry2.bak");
			fos = new FileOutputStream("text/poetry2.bak", true);
			int data = 0;
			
			while((data=fis.read())!=-1) {
				fos.write(data);
			}
			
			System.out.println("파일에 저장함!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis!=null) fis.close();
				if(fos !=null) fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
