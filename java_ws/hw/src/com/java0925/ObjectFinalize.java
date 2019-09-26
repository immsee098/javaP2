package com.java0925;

class MyName{
	String objName;
	public MyName(String name){
		objName=name;
	}	
	protected void finalize() throws Throwable{  
		super.finalize();
		System.out.println(objName+"�� �Ҹ�Ǿ����ϴ�.");
	}
}
class ObjectFinalize{	
	public static void main(String[] args){
		MyName obj1=new MyName("�ν��Ͻ�1");
		MyName obj2=new MyName("�ν��Ͻ�2");

		obj1=obj2;  //(1)  
		obj2=null;  //(2)  
		//obj1=null;  //(3)  

		System.out.println("���α׷��� �����մϴ�.");
		System.gc();
		System.runFinalization();
	}
}
