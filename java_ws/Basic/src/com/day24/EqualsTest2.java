package com.day24;

class Salesman{
	private long id;
	
	Salesman(long id){
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		//return this.id == ((Salesman)obj).id;
		if(obj !=null && obj instanceof Salesman) {
			return this.id == ((Salesman)obj).id; 
			} else {return false;}
	} //���� equals �������̵� �������(new�ҷ��� �ٿ�����..)
	
}

public class EqualsTest2 {

	public static void main(String[] args) {
		Salesman sm = new Salesman(1001);
		Salesman sm2 = new Salesman(1001);
		
		if (sm.equals(sm2)) {
			System.out.println("���� ���� ���");
		} else {
			System.out.println("���� �ٸ����");
		}
		
		if(sm==sm2) {
			System.out.println("���� ���� �ּ�");
		} else {
			System.out.println("���� �ٸ� �ּ�");
		}

	}

}
