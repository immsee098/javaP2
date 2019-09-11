package com.day17;

class Unit {
	protected int x;
	protected int y;
	
	Unit(int x , int y){
		this.x =x;
		this.y =y;
	}
	
	public void move(int x, int y) {
		System.out.println("이동");
	}
	
	public void stop() {
		System.out.println("멈춘다");
	}
	
}

class Marine extends Unit {
	Marine(int x, int y){
		super(x, y);
	}
	
	public void move(int x, int y) {
		System.out.println("보병이"+x+", "+y+"위치로 이동한다");
		this.x = x;
		this.y = y;
	}
	
	public void changeMode() {
		System.out.println("공격모드를 변환한다");
	}
	
	public void stimPack() {
		System.out.println("스팀팩을 사용한다");
	}
}


class DropShip extends Unit{
	DropShip(int x, int y){
		super(x, y);
	}
	
	public void move(int x, int y) {
		System.out.println(x+", "+y+"위치로 수송선이 이동한다");
		this.x = x;
		this.y = y;
	}
	
	public void load() {
		System.out.println("선택 대상을 태운다");
	}
	
	public void unload() {
		System.out.println("선택 대상을 내린다");
	}
}


class Tank extends Unit {
	Tank(int x, int y){
		super(x, y);
	}
	
	public void move(int x, int y) {
		System.out.println("탱크를"+x+", "+y+"위치로 이동");
	}
	
	public void changeMode() {
		System.out.println("형태변환");
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
