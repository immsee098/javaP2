package com.day14;

class Data { 
	int x; 
}

class CallByValue { 
	public static void main(String[] args) { 
		Data d = new Data(); 
		d.x = 10; 
		System.out.println("main() : x = " + d.x);
		
		change(d.x); 
		System.out.println("After change(d.x)"); 
		System.out.println("main() : x = " + d.x);
	}
	
	//메서드에서 매개변수의 값을 변경해도 호출한 곳에서 영향받지 않음
	static void change(int x) {  
		// 기본형 매개변수 
		x = 1000; 
		System.out.println("change() : x = " + x); 
		}
	}


