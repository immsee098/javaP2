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
		
		//1. ����Ʈ ���
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
		
		//2. ���ڱ��
		System.out.println("\n=====���� ���======");
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
