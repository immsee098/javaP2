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
		
		//Child2와 ProtectedTest는 같은 패키지이나
		//parent와 ProtectedTest는 다른 패키지임
		
		//ch.age=20; //error, private
		ch.name="홍길동"; //error, default
		//ch.address="서초4동" //error, protected
		ch.tel="01026057621"; //public
		ch.showInfo();
	}

}
