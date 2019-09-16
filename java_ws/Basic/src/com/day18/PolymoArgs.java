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
//			System.out.println(p.kind()+"이가 등록을 합니다");
//		} else {
//			System.out.println(p.kind()+"이는 등록을 할 수 없습니다");
//		}
//	}
//	
//	public static void register(Student s) {
//		System.out.println(s.kind()+"이가 등록을 합니다");
//	}
//
//	public static void main(String[] args) {
//		Student s = new Student();
//		register(s);
//
//	}
//
//}
