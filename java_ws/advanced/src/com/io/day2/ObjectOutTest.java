package com.io.day2;

import java.awt.Frame;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class ObjectOutTest {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream("text/member.ser");
			oos=new ObjectOutputStream(fos);
			
			Member m1=new Member("hong", "1", 20);
			Member m2=new Member("kim", "123", 25);
			
			ArrayList<Member> list=new ArrayList<Member>();
			list.add(m1);
			list.add(m2);
			
			Date d = new Date();
			
			Frame f = new Frame("test frame");
			
			oos.writeObject(m1);
			oos.writeObject(m2);
			oos.writeObject(list);
			oos.writeObject(d);
			oos.writeObject(f);
			
			System.out.println("객체 저장 완료!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos!=null) oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
