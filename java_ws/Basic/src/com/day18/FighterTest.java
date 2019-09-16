package com.day18;

interface Attackable { //������ ���(unit)�� �����ϴ� ��� 
	public abstract void attack(Unit5 unit);  }

interface Movable {
		void move(int x, int y); //������ ��ġ(x,y)�� �̵��ϴ� ��� 
		}
		//�������̽������� ��ӵ� ����-extends Ű���� �̿�, ���߻���� ������ 
interface Fightable extends Attackable, Movable{ }

abstract class Unit5 {
	protected int x; //������ ��ġ(x��ǥ) 
	protected int y; //������ ��ġ(y��ǥ) 
	protected int currentHP; //������ ü��
	Unit5(int x, int y, int currentHP) {
		this.x = x;
		this.y = y;
		this.currentHP = currentHP;
	}
} //class

class Fighter extends Unit5 implements Fightable {
	Fighter(int x, int y, int currentHP) {
		super(x, y, currentHP);
	}
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x + "," + y + "��ġ�� �̵��մϴ�");
	}
	public void attack(Unit5 unit) {
		System.out.println(unit.x + "," + unit.y + "��ġ�� �ְ�, " + unit.currentHP + "�� ü���� ���� ������ �����մϴ�");
	}
} //class

		

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter(10, 20, 100);
		
		f.move(30, 40);
		
		//���ְ�ü�� abstract�� �Ұ� �ڽİ�ü ��� ���(Fighter)
		Fighter f2 = new Fighter(30, 40, 70);
		f.attack(f2);
		
		if(f instanceof Fighter) {
			System.out.println("f�� Fighter�� �ν��Ͻ��̴�");
		}
		if(f instanceof Unit5) {
			System.out.println("f�� Unit5�� �ν��Ͻ��̱⵵�ϴ�");
		}
		if(f instanceof Object) {
			System.out.println("f�� Object�� �ν��Ͻ��̱⵵ �ϴ�");
		}
		
		if(f instanceof Movable) {
			System.out.println("f�� Movable�� �ν��Ͻ��̱⵵ �ϴ�");
		}
		if(f instanceof Object) {
			System.out.println("f�� Object�� �ν��Ͻ�");
		}
	}

}
