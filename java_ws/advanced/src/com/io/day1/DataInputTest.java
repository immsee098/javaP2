package com.io.day1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputTest {

	public static void main(String[] args) {
		FileInputStream fis=null;
		DataInputStream dis=null;
		
		try {
			fis=new FileInputStream("text/sample.dat");
			dis=new DataInputStream(fis);
			
			int a=dis.readInt();
			System.out.println("int��:"+ a);
			
			boolean b=dis.readBoolean();
			System.out.println("boolean��:"+ b);
			
			System.out.println("float ��:"+dis.readFloat());
			System.out.println("char ��:"+dis.readChar());
			System.out.println("UTF ��:"+dis.readUTF());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
