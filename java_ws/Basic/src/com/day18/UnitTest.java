package com.day18;

abstract class Unit {
	protected int x, y;
	
	Unit(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	abstract public void move(int x, int y);
	
	public void stop() {
		System.out.println("현재 위치에 정지");
	}
}

class Marine extends Unit {
	Marine(int x, int y) {
		super(x,y);
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("보병이"+x+", "+y+"위치로 이동합니다.");
	}
	
	public void stimpak() {
		System.out.println("스팀팩을 사용합니다");
	}
}

class Tank extends Unit {
	Tank(int x, int y) {
		super(x,y);
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("탱크가"+x+", "+y+"위치로 이동합니다.");
	}
	
	public void changeMode() {
		System.out.println("공격모드를 변환한다");
	}
}

class Dogship extends Unit {
	Dogship(int x, int y) {
		super(x,y);
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x+", "+y+"위치로 수송선이 이동합니다.");
	}
	
	public void load() {
		System.out.println("선택된 대상을 태운다");
	}
	
	public void unload() {
		System.out.println("선택된 대상을 내린다");
	}
}


public class UnitTest {

	public static void main(String[] args) {
		Unit u = new Marine(10, 20);
		Marine m = (Marine)u;
		m.stimpak();
		
		//유닛배열에 자식 3개
		Unit[] un = new Unit[3];
		un[0] = new Marine(200,300);
		un[1] = new Tank(100, 300);
		un[2] = new Dogship(500,300);
		
		//기본 for에서 오버라이딩
		for(int i=0; i<un.length; i++) {
			un[i].move(100, 200);
		}
		
		//확장for자신 호출
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
