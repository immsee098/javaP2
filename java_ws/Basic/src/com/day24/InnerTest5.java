package com.day24;

public class InnerTest5 {
	class InstanceInner{}
	static class StaticInner{}
	
	public void method() {
		InstanceInner inner = new InstanceInner();
		StaticInner si = new StaticInner();
	}
	
	public static void method2(){
		StaticInner si = new StaticInner();
		//InstanceInner inner = new InstanceInner(); //error
		//static �ȿ����� static�� ��ü ���� ����
	}
	
	public static void main(String[] args) {
		

	}

}
