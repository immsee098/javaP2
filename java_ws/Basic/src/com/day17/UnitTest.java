package com.day17;

class Unit {
	protected int x;
	protected int y;
	
	Unit(int x , int y){
		this.x =x;
		this.y =y;
	}
	
	public void move(int x, int y) {
		System.out.println("�̵�");
	}
	
	public void stop() {
		System.out.println("�����");
	}
	
}

class Marine extends Unit {
	Marine(int x, int y){
		super(x, y);
	}
	
	public void move(int x, int y) {
		System.out.println("������"+x+", "+y+"��ġ�� �̵��Ѵ�");
		this.x = x;
		this.y = y;
	}
	
	public void changeMode() {
		System.out.println("���ݸ�带 ��ȯ�Ѵ�");
	}
	
	public void stimPack() {
		System.out.println("�������� ����Ѵ�");
	}
}


class DropShip extends Unit{
	DropShip(int x, int y){
		super(x, y);
	}
	
	public void move(int x, int y) {
		System.out.println(x+", "+y+"��ġ�� ���ۼ��� �̵��Ѵ�");
		this.x = x;
		this.y = y;
	}
	
	public void load() {
		System.out.println("���� ����� �¿��");
	}
	
	public void unload() {
		System.out.println("���� ����� ������");
	}
}


class Tank extends Unit {
	Tank(int x, int y){
		super(x, y);
	}
	
	public void move(int x, int y) {
		System.out.println("��ũ��"+x+", "+y+"��ġ�� �̵�");
	}
	
	public void changeMode() {
		System.out.println("���º�ȯ");
	}
}

public class UnitTest {

	public static void main(String[] args) {
		Unit[] un = new Unit[4];
		un[0] = new Marine(3, 5);
		un[1] = new DropShip(10,40);
		un[2] = new Tank(5,50);
		un[3] = new Tank(50, 20);

		for(Unit n : un) {
			n.move(400, 300);
		}
	}

}
