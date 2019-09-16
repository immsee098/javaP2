package com.day18;

interface Attackable { //지정된 대상(unit)을 공격하는 기능 
	public abstract void attack(Unit5 unit);  }

interface Movable {
		void move(int x, int y); //지정된 위치(x,y)로 이동하는 기능 
		}
		//인터페이스끼리의 상속도 가능-extends 키워드 이용, 다중상속이 가능함 
interface Fightable extends Attackable, Movable{ }

abstract class Unit5 {
	protected int x; //유닛의 위치(x좌표) 
	protected int y; //유닛의 위치(y좌표) 
	protected int currentHP; //유닛의 체력
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
		System.out.println(x + "," + y + "위치로 이동합니다");
	}
	public void attack(Unit5 unit) {
		System.out.println(unit.x + "," + unit.y + "위치에 있고, " + unit.currentHP + "의 체력을 갖는 유닛을 공격합니다");
	}
} //class

		

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter(10, 20, 100);
		
		f.move(30, 40);
		
		//유닛객체는 abstract라 불가 자식객체 대신 사용(Fighter)
		Fighter f2 = new Fighter(30, 40, 70);
		f.attack(f2);
		
		if(f instanceof Fighter) {
			System.out.println("f는 Fighter의 인스턴스이다");
		}
		if(f instanceof Unit5) {
			System.out.println("f는 Unit5의 인스턴스이기도하다");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object의 인스턴스이기도 하다");
		}
		
		if(f instanceof Movable) {
			System.out.println("f는 Movable의 인스턴스이기도 하다");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object의 인스턴스");
		}
	}

}
