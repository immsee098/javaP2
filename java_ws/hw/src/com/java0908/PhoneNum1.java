package com.java0908;

import java.util.Scanner;

class PhoneInfo{
	private String name;
	private String phoneNumber;
	private String birth;
	
	public PhoneInfo(){	
	}

	public PhoneInfo(String name, String phoneNumber, String birth){
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birth=birth;
	}

	public PhoneInfo(String name, String phoneNumber){
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	
	public String getName() {
		return name;
	}

	public void showPhoneInfo()	{
		System.out.println("name: "+name);
		System.out.println("phone: "+phoneNumber);

		if(birth!=null && !birth.isEmpty())
			System.out.println("birth: "+birth);
		
		System.out.println();
	}
}

class PhoneNum1
{
	//static Scanner sc=new Scanner(System.in);
	
	public static void showMenu(){
		System.out.println("1. ������ �Է�(����)");
		System.out.println("2. ��ü ������ ��ȸ");
		System.out.println("3. ������ �˻�");
		System.out.println("4. ������ ����");
		System.out.println("5. ���α׷� ����");
	}
	
	public static PhoneInfo inputData(){
		Scanner sc=new Scanner(System.in);

		System.out.print("�̸�: ");
		String name=sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phone=sc.nextLine();
		System.out.print("�������: ");
		String birth=sc.nextLine();
		
		PhoneInfo info=new PhoneInfo(name, phone, birth);
		return info;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int choice=0;
		PhoneInfo[] info = new PhoneInfo[100];
		
		while(true)	{
			showMenu();
			choice=sc.nextInt();
			sc.nextLine();	
			
			switch(choice){
				case 1:
					PhoneInfo ph = inputData();
					for(int i=0; i<info.length; i++) {
						if(info[i]==null) {
							info[i] = ph;
							break;
						}
					}
					break;
					
				case 2:
					for(int i=0; i<info.length;i++) {
						if(info[i] != null) {
							info[i].showPhoneInfo();
						}
					}
					break;
				case 3:
					System.out.println("������ �˻��� �����մϴ�.");
					System.out.print("�̸�:");
					String search = sc.nextLine();
					for(int i=0; i<info.length;i++) {
						if(info[i].getName().equals(search)) {
							info[i].showPhoneInfo();
							break;
						}
					}
					break;
				case 4:
//					String del = sc.nextLine();
//					for(int i=0; i<info.length;i++) {
//						if(info[i].getName().equals(del)) {
//							info[i] = null;
//						}
//					}
					break;
				case 5:
					System.out.println("���α׷��� �����մϴ�.");
					return;
				default:
					System.out.println("�߸� �����Ͽ����ϴ�. �ٽ� �����ϼ���\n");
					continue;
			}
		}//while
	}
}