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
		change(pp); //�̷��ĵ� ���� �� int ó�� ����
	}
	
	//�޼��忡�� �Ű������� ���� �����ص� ȣ���� ������ ������� ����
	static void change(Data2 d) {  
		d.x= 1000;
		System.out.println("change() : x = " + d.x); 
		}
	
	public static void change3(int[] arr) {
		arr[0] = 300;
		System.out.println("change3() :arr[0]"+arr[0]+", �ּ�:"+arr);
	}
	}


