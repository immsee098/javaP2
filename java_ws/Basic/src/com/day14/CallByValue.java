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
	
	//�޼��忡�� �Ű������� ���� �����ص� ȣ���� ������ ������� ����
	static void change(int x) {  
		// �⺻�� �Ű����� 
		x = 1000; 
		System.out.println("change() : x = " + x); 
		}
	}


