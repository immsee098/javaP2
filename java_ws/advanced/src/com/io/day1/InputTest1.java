package com.io.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputTest1 {

	public static void main(String[] args) {
		/*public int read() throws IOException
		- Reads a byte of data from this input stream.
		
		- inpuStream���� 1����Ʈ�� �о�´�
		- �ƽ�Ű�ڵ带 ������
		- �� �̻� �о�� ���� ������ -1�� ������*/
		
		FileInputStream fis=null;
		
		try {
			fis= new FileInputStream("text/poetry2.txt");
			
			int data=0;
			while((data=fis.read())!=-1) { //�̰� �ƽ�Ű�ڵ�� �����ؼ� char�� ��ȯ�������
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
