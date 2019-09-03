package com.day11.object;


class Account2 {
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
	
	//������
	/*
	 ������ - ������� �ʱ�ȭ�� �������� �ϴ� �޼���
	 		��ü�� ������ �� �ڵ����� ȣ��Ǿ� ���� ���� �����ϴ� �޼���
	 		Ŭ������� ����
	 		�Ű������� ���� �� ������ ��ȯŸ���� ����
	 		
	 		
	 		�⺻ �����ڴ� �����Ϸ��� �ڵ����� ������ش�
	 */
	Account2 () {
		
	}
	
	Account2(String p_accId, String p_name, int p_balance) {
		accId = p_accId;
		name = p_name; //�̸�
		balance = p_balance;
	}
	
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


public class AccountTest2 {

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
		
		Account2 acc = new Account2();
		
		//�����ڿ� ���� ���� �ʱ�ȭ
		Account2 acc2 = new Account2("123-2000-001", "������", 400000);
		acc2.showInfo(); //��������� default������ �ʱ�ȭ��
		
		//cf. Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		
		//�ι�° ��ü ����
		acc2.accId = "100-2000-001";
		acc2.name = "ȫ�浿";
		acc2.balance = 100000;
		
		acc2.withdraw(30000);
		acc2.showInfo();
		
		//������� �� �����ϱ�
		acc2.balance = 400000;
		acc2.showInfo();
		
	}

}
