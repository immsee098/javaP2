package com.day14;

public class StudentTest {

	public static void main(String[] args) {
		Student arr = new Student("ȫ�浿", 2012001);
		arr.display();
		
		
		Student[] arr2 = new Student[3];
		arr2[0] = new Student("�迬��", 20123802);
		arr2[1] = new Student("���缮", 2412343);
		arr2[2] =new Student("������", 4325666);
		
		for(Student n : arr2) {
			n.display();
		}
 
	}

}
