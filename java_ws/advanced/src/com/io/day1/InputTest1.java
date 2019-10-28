package com.io.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputTest1 {

	public static void main(String[] args) {
		/*public int read() throws IOException
		- Reads a byte of data from this input stream.
		
		- inpuStream에서 1바이트씩 읽어온다
		- 아스키코드를 리턴함
		- 더 이상 읽어올 것이 없으면 -1을 리턴함*/
		
		FileInputStream fis=null;
		
		try {
			fis= new FileInputStream("text/poetry2.txt");
			
			int data=0;
			while((data=fis.read())!=-1) { //이거 아스키코드로 리턴해서 char로 변환해줘야함
				//System.out.println((char)data);
				System.out.print((char)data);
				//public void print(char c)
				//- Prints a character.
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
		}
		

	}

}
