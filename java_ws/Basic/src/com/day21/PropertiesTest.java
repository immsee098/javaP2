package com.day21;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		// properties - Map�������̽��� ���� Ŭ����
		// HashMap�� �������� Hashtable�� ��ӹ޾� ������ Ŭ����
		//(String, String)���·� ����
		//load() �޼���� ���Ͽ� �ִ� �����͸� �о�ͼ� ��� ����
		//��� �ϳ��� �о�� ���� getproperty(key) �̿�
		
		Properties props = new Properties();
		
		props.setProperty("timeout","30"); 
		props.setProperty("language","kr"); 
		props.setProperty("size","10"); 
		props.setProperty("capacity","10");
		
		String val = props.getProperty("timeout");
		System.out.println("timeout=>"+val);
		
		//public Enumeration<?> propertyNames()
		Enumeration en = props.propertyNames();
		while(en.hasMoreElements()) {
			String key =(String)en.nextElement();
			String value = props.getProperty(key);
			System.out.println(key+" : "+value);
		}
		
		System.out.println("\n"+props+"\n");
		
		props.list(System.out);

	}

}
