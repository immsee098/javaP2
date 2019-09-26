package com.java0925;

class Person {
	private long id;

	Person(long id) {
		this.id = id;
	}

	//(1) equals 오버라이딩
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Person) { 
			return id ==((Person)obj).id; 
			} else { 
				return false; 
				} 
		}
	}

class Exam3 {
	public static void main(String[] args){
		Person p1 = new Person(9011081111222L);
		Person p2 = new Person(9011081111222L);

		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		} else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}

	}
}

