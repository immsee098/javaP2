package com.day21;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		// properties - Map인터페이스의 구현 클래스
		// HashMap의 구버전인 Hashtable을 상속받아 구현한 클래스
		//(String, String)형태로 저장
		//load() 메서드로 파일에 있는 데이터를 읽어와서 사용 가능
		//요소 하나를 읽어올 때는 getproperty(key) 이용
		
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
