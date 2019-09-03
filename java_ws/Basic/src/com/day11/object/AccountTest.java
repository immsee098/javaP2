package com.day11.object;


class Account {
	/*
	 ��ü(Object) - ����, ���
	 ��ü ���� ���α׷���(Object Oriented Programming-OOP)
	 - ��ü�� �ϴ� �ൿ�� �ִ� �״�� ��üȭ���� ���α׷��� �ϴ� ��
	 
	 ��ü�� ��������(�Ӽ�, ������)�� �ൿ(���)���� �����Ǿ� �ִ�
	 - ���������� ������ ǥ��
	 - �ൿ�� �ż���� ǥ��
	 
	 ��ü�� ������ ����� ���ؼ��� ��ü�� �����ϴ� Ʋ�� �ʿ���
	 �� Ʋ�� class
	 
	 Ŭ����(class) - ��ü�� �����ϱ� ���� Ʋ�μ� ���������� �ൿ���� �����Ǿ� �ִ�
	 
	 class(Ŭ����)				object(��ü)
	 -----------------------------------------
	 �ؾƲ						�ؾ
	 ��ǰ���赵						��ǰ
	 �ڵ������赵					�ڵ���
	 -----------------------------------------
	 Ʋ							��ü
	  -----------------------------------------
	  
	  Ŭ���� - ��������� �޼���� ����
	  
	  class Ŭ������ {
	  	//�������(�ʵ�)
	  	//�޼���
	  }
	  */
	
	//������� Ŭ����
	//���� ������¿��� 30000���� ����ߴ�
	//1. �������
	String accId; // ���¹�ȣ
	String name; //�̸�
	int balance; //�ܾ�
	
	
	//2. �޼���
	//����ϴ�
	public void withdraw(int money) {
		balance -= money;
	}
	
	//�Ա��ϴ�
	public void deposit(int money) {
		balance += money;
	}
	
	//��� �޼���
	public void showInfo() {
		System.out.println("���¹�ȣ:" +accId);
		System.out.println("�̸�:" +name);
		System.out.println("�ܾ�:"+balance+"\n");
	}
	
} //class


public class AccountTest {

	public static void main(String[] args) {
		//��ü ����
		//Ŭ������ ����ϱ� ���ؼ��� ��ü�� �����ؼ� ��ü�� ����ؾ� ��
		//=>�ش� Ŭ������ ��������� �޼��带 ȣ���ؼ� ���
		
		/*
		 ��ü�� �����ϴ� ���
		 Ŭ������ �������� = new Ŭ������();
		 ��) Account acc = new Account();
		 
		 - �޼��� ȣ��
		 acc.withdraw(3000);
		 
		 - ������� ����
		 acc.balance=10000;
		 */
		
		//ù��° ��ü ����
		Account acc = new Account();
		acc.showInfo(); //��������� default������ �ʱ�ȭ��
		
		//cf. Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		
		//�ι�° ��ü ����
		Account acc2 = new Account();
		acc2.accId = "100-2000-001";
		acc2.name = "ȫ�浿";
		acc2.balance = 100000;
		
		acc2.withdraw(30000);
		acc2.showInfo();
		
	}

}
