//package com.day18;
//
//class Person{
//	public String kind() {
//		return "Person";
//	}
//	
//}
//
//class Student extends Person {
//	public String kind() {
//	
//}
//
//class Graduate extends Person {
//	public String kind() {
//		
//	}
//}
//
//class Professor extends Person {
//	public String kind() {
//		}	
//}
//
//class Assistant extends Professor{
//	public String kind() {
//	}
//}
//
//public static class PolymoArgs {
//	
//	public static void register(Person p) {
//		if(p instanceof Student || p instanceof Graduate || p instanceof Assistant) {
//			System.out.println(p.kind()+"�̰� ����� �մϴ�");
//		} else {
//			System.out.println(p.kind()+"�̴� ����� �� �� �����ϴ�");
//		}
//	}
//	
//	public static void register(Student s) {
//		System.out.println(s.kind()+"�̰� ����� �մϴ�");
//	}
//
//	public static void main(String[] args) {
//		Student s = new Student();
//		register(s);
//
//	}
//
//}
