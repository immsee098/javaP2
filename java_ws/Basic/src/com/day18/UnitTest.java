package com.day18;

abstract class Unit {
	protected int x, y;
	
	Unit(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	abstract public void move(int x, int y);
	
	public void stop() {
		System.out.println("���� ��ġ�� ����");
	}
}

class Marine extends Unit {
	Marine(int x, int y) {
		super(x,y);
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("������"+x+", "+y+"��ġ�� �̵��մϴ�.");
	}
	
	public void stimpak() {
		System.out.println("�������� ����մϴ�");
	}
}

class Tank extends Unit {
	Tank(int x, int y) {
		super(x,y);
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("��ũ��"+x+", "+y+"��ġ�� �̵��մϴ�.");
	}
	
	public void changeMode() {
		System.out.println("���ݸ�带 ��ȯ�Ѵ�");
	}
}

class Dogship extends Unit {
	Dogship(int x, int y) {
		super(x,y);
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x+", "+y+"��ġ�� ���ۼ��� �̵��մϴ�.");
	}
	
	public void load() {
		System.out.println("���õ� ����� �¿��");
	}
	
	public void unload() {
		System.out.println("���õ� ����� ������");
	}
}


public class UnitTest {

	public static void main(String[] args) {
		Unit u = new Marine(10, 20);
		Marine m = (Marine)u;
		m.stimpak();
		
		//���ֹ迭�� �ڽ� 3��
		Unit[] un = new Unit[3];
		un[0] = new Marine(200,300);
		un[1] = new Tank(100, 300);
		un[2] = new Dogship(500,300);
		
		//�⺻ for���� �������̵�
		for(int i=0; i<un.length; i++) {
			un[i].move(100, 200);
		}
		
		//Ȯ��for�ڽ� ȣ��
		for(Unit n: un) {
			if(n instanceof Marine) {
				Marine ma = (Marine)n;
				ma.stimpak();
			} else if(n instanceof Tank) {
				Tank ta = (Tank)n;
				ta.changeMode();
			} else if(n instanceof Dogship) {
				Dogship ds = (Dogship)n;
				ds.load();
				ds.unload();
			}
		}
		
		

	}

}
