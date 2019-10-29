package com.io.day2;

import java.awt.Frame;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Date;

public class ObjectInTest {

	public static void main(String[] args) {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream("text/member.ser");
			ois=new ObjectInputStream(fis);
			
			Member m1=(Member) ois.readObject();
			m1.showInfo();
			
			Member m2=(Member) ois.readObject();
			m2.showInfo();
			
			ArrayList<Member> alist
				=(ArrayList<Member>) ois.readObject();
			System.out.println("\n=====List=====");
			for(Member m : alist) {
				m.showInfo();
			}
			
			Date date=(Date) ois.readObject();
			System.out.println("date="+date.toLocaleString());
			
			Frame f=(Frame) ois.readObject();
			f.setSize(300,200);
			f.setVisible(true);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
