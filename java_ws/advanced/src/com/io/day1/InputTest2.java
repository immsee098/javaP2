package com.io.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputTest2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		String fileName="text/poetry2.txt";
		try {
			fis=new FileInputStream(fileName);
			
			int count = 0, data=0;
			while((data=fis.read())!=-1) {
				System.out.println((char)data);
				count++;
			}
			System.out.println("반복횟수:"+count);
			File file = new File(fileName);
			System.out.print("파일크기:"+file.length());
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis!=null) fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
