package com.io.day1;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos=null;
		
		try {
			fos=new FileOutputStream("text/sample.dat");
			dos=new DataOutputStream(fos);
			
			dos.writeInt(150);
			dos.writeBoolean(true);
			dos.writeFloat(3.14f);
			dos.writeChar('A');
			dos.writeUTF("hello ¾È³ç!");
			
			System.out.println("ÆÄÀÏ¿¡ ÀúÀåµÊ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(dos!=null) dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
