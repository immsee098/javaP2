package com.day14;
import  com.day14.Parent5;

class Child2 extends Parent5 {
	public void showInfo() {
		//System.out.println(age); //error, private
		System.out.println(name);
		System.out.println(address); //error, default
		System.out.println(tel);
	}
}

public class ProtectedTest {

	public static void main(String[] args) {
		Child2 ch = new Child2();
		
		//Child2�� ProtectedTest�� ���� ��Ű���̳�
		//parent�� ProtectedTest�� �ٸ� ��Ű����
		
		//ch.age=20; //error, private
		ch.name="ȫ�浿"; //error, default
		//ch.address="����4��" //error, protected
		ch.tel="01026057621"; //public
		ch.showInfo();
	}

}
