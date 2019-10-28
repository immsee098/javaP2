package com.io.day1;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputTest2 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		DataInputStream dis=null;
		
		int sum=0;
		try {
			fis=new FileInputStream("text/score.dat");
			dis=new DataInputStream(fis);
			
			while(true) {
				int n=dis.readInt();
				sum+=n;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			//DataInputStream�� readInt() �� ���� �����͸� �д� �޼���� 
			//�� �̻� ���� �����Ͱ� ������ EOFException �� �߻���Ŵ

			System.out.println("sum="+sum);		
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(dis!=null) dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

