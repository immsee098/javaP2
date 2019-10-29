package com.io.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputTest2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("text/poetry4.txt");
			fos = new FileOutputStream("text/poetry4.bak");
			
			int cnt = 0, count = 0, total=0, i=0;
			byte[] buf = new byte[1024];
			
			while((cnt=fis.read())!=-1) {
				fos.write(buf, 0, cnt);
				
				/*
				public int read(byte[] b)throws IOException
				 -InputStream에서 읽어서 byte배열에 넣는다(byte배열의 길이만큼)
				 -읽어온 개수를 리턴함 
							
				public void write(byte[] b,int off,int len)
							throws IOException
				 - byte배열에서 시작위치 off에서 len개 만큼 OutputStream에 출력
				*/
				 
				//System.out.println(buf);
				System.out.write(buf,0,cnt);
				count++;
				total+=cnt;
				//System.out.println("\n=====================cnt:"+cnt);
			}
			System.out.println("반복횟수:"+count);
			System.out.println("total="+total);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis!=null) fis.close();
				if(fos!=null) fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
