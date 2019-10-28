package com.io.day1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream("text/poetry3.txt");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("text/poetry4_bak.txt");
			bos = new BufferedOutputStream(fos);
			
			int cnt =0;
			//byte[] buf = new byte[1024];
			
			while((cnt=bis.read())!=-1) {
				bos.write(cnt);
			}
			
			System.out.write(cnt);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
