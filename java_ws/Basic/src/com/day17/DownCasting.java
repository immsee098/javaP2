package com.day17;

class Car {
	public void drive() {
		System.out.println("����");
	}
	
	public void stop() {
		System.out.println("�ڸ� �����");
	}
}


class FireEngine extends Car {
	public void drive() {
		System.out.println("�ҹ����� �����մϴ�");
	}
	
	public void water() {
		System.out.println("water!!");
	}
}

class Ambulance extends Car {
	public void drive() {
		System.out.println("�ں深���� �����մϴ�");
	}
	
	public void siren() {
		System.out.println("siren~!!");
	}
}


public class DownCasting {

	public static void main(String[] args) {
		/*
		 ���������� ����ȯ - ���������� ��Ӱ��迡 �ִ� �����鳢���� ����ȯ�� ������
		 
		 [1] �ڵ�����ȯ(��ĳ����-upcasting, �������� ���)
		 	�θ� �������� = �ڽ�
		 	=>�ڽ� Ÿ���� ���������� �θ� Ÿ������ ����ȯ
		 	��) Parent p = new Child();
		 
		 [2] ���������ȯ(�ٿ�ĳ����-downcasting, �ڽĸ��� �޼��� ȣ�� ����)
		 	�ڽ� �������� = �θ� ��������
		 	=> �θ� Ÿ���� ���������� �ڽ�Ÿ������ ����ȯ
		 	��) Child ch = (Child)p;
		 		Child ch = (Child)new Parent(); //���ܹ߻�
		 */
		
		Car c = new FireEngine();
		c.drive(); //�ڽ��� �������̵� �޼��� ȣ��
		//c.water(); //error
		
		Car c2 = new Ambulance();
		c2.drive();
		//c2.siren(); //error, �ڽ��� �޼��� ȣ�� �Ұ�
		
		//����� ����ȯ - downcasting
		FireEngine f = (FireEngine)c;
		f.water(); //�ڽĸ��� �޼��� ȣ�� ��������
		
		Ambulance am = (Ambulance)c2;
		am.siren();
		
		//����
		//FireEngine f2 =(FireEngine)new Car(); //���������ǳ� ���������
		//f2.drive();
		
		/*
		 �������� instanceof Ŭ����(Ÿ��)
		 => ���������� Ŭ������ �ν��Ͻ��̸� true, �ƴϸ� false
		 => �ڽĸ��� �޼��� ȣ�� ��������
		 \
		 ���������� ���� �ν��Ͻ��� �˾ƺ��� ���� ���
		 */
		System.out.println("c�� FireEngine�� �ν��Ͻ��ΰ�?"+(c instanceof FireEngine));
		System.out.println("c2�� Ambulance�� �ν��Ͻ��ΰ�?"+(c2 instanceof Ambulance));
		
		if(c instanceof FireEngine) {
			FireEngine f3 = (FireEngine)c;
			f3.water();
		} else {
			System.out.println("FireEngine���� ����ȯ �Ұ�");
		}
		
		if(c2 instanceof FireEngine) {
			FireEngine f3 = (FireEngine)c2;
			f3.water();
		} else if(c2 instanceof Ambulance) {
			Ambulance am3 = (Ambulance)c2;
			am3.siren();
		} else {
			System.out.println("Ambulance�� ����ȯ �Ұ�");
		}
		
		/*
		 �ڽ� instanceof �θ�
		 => true
		 => �ڽ��� �θ��� �ν��Ͻ��̱⵵ �ϹǷ�
		 
		 //�θ��� ���������� ���� �θ� ���� ������
		 */
		
		FireEngine f4 = new FireEngine();
		if(f4 instanceof FireEngine) {
			System.out.println("f4�� FireEngine�� �ν��Ͻ��̴�");
		}
		if(f4 instanceof Car) {
			System.out.println("f4�� Car�� �ν��Ͻ��̴�");
		}
		if(f4 instanceof Object) {
			System.out.println("f4�� Object�� �ν��Ͻ��̴�");
		}
	}

}
