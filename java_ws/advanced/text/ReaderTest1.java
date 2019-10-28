package com.io.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest1 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileReader fr=null;
		
		String fileName="text/test.txt";
		
		//1. 바이트 기반
		try {
			fis=new FileInputStream(fileName);
			
			int data=0;			
			while((data=fis.read())!=-1) {
				//System.out.println(data);
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//2. 문자기반
		System.out.println("\n=====문자 기반======");
		try {
			fr=new FileReader(fileName);
			
			int data=0;
			while((data=fr.read())!=-1) {
				//System.out.println(data);
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
