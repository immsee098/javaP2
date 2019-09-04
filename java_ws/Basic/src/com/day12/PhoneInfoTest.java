package com.day12;

import java.util.Scanner;

class PhoneInfo{
	private String name;
	private String num;
	private String birth;
	
	PhoneInfo(String name, String num, String birth){
		this.name = name;
		this.num = num;
		this.birth = birth;
	}
	
	PhoneInfo(String name, String num){
		this.name = name;
		this.num = num;
	}

	public void getname(String p_name) {
		name = p_name;
	}
	
	public String setname() {
		return name;
	}
	
	public void gettime(String p_num) {
		num = p_num;
	}
	
	public String setnum() {
		return num;
	}
	public void getbirth(String p_birth) {
		birth = p_birth;
	}
	
	public String setbirth() {
		return birth;
	}
	
}


public class PhoneInfoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("�����ϼ���...");
			System.out.println("1.������ �Է�");
			System.out.println("2. ���α׷� ����");
			
			System.out.print("\n���� : ");
			int select = sc.nextInt();
			
			if (select==2) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
			sc.nextLine();
			
			System.out.print("�̸��� �Է� :");
			String name = sc.nextLine();
			
			System.out.print("����ȣ�� �Է� : ");
			String phone = sc.nextLine();
			
			System.out.print("������� �Է�(����) : ");
			String birth = sc.nextLine().trim();
			
			System.out.println("========�Էµ� ���� ���========");
			
			if(birth.equals("\n")||birth.equals("")||birth.equals(null)) {
				PhoneInfo p1 = new PhoneInfo(name, phone);
				System.out.println("name: "+p1.setname());
				System.out.println("phone: "+p1.setnum());
				
			} else {
				PhoneInfo p1 = new PhoneInfo(name, phone, birth);
				System.out.println("name: "+p1.setname());
				System.out.println("phone: "+p1.setnum());
				System.out.println("birth: "+p1.setbirth());
			}
			
		}

		
		
		
		

	}

}
