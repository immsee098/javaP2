package com.day14;

class Data2 { 
	int x; 
}

class CallByValue2 { 
	public static void main(String[] args) { 
		Data2 d = new Data2(); 
		d.x = 10; 
		System.out.println("main() : x = " + d.x);
		
		change(d); 
		System.out.println("After change(d.x)"); 
		System.out.println("main() : x = " + d.x);
		
		int[] arr = {7,8,9};
		change3(arr);
		
		Data2 pp = new Data2();
		change(pp); //이런식도 가능 걍 int 처럼 쓰기
	}
	
	//메서드에서 매개변수의 값을 변경해도 호출한 곳에서 영향받지 않음
	static void change(Data2 d) {  
		d.x= 1000;
		System.out.println("change() : x = " + d.x); 
		}
	
	public static void change3(int[] arr) {
		arr[0] = 300;
		System.out.println("change3() :arr[0]"+arr[0]+", 주소:"+arr);
	}
	}


