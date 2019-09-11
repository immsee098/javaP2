package com.day17;

public class DownCasting2 {

	public static void main(String[] args) {
		Unit[] uArr = new Unit[4];
		uArr[0] = new Marine(10,30);
		uArr[1] = new Tank(15,25);
		uArr[2] = new DropShip(33,44);
		uArr[3] = new Marine(77,27);
		
		//다형성 이용 - 오버라이딩 메서드 호출
		for(int i=0; i< uArr.length; i++) {
			uArr[i].move(100, 200);
		}
		
		System.out.println("\n==============downcasting 이용==================");
		
		for(int i=0; i<uArr.length;i++) {
			if(uArr[i] instanceof Marine) {
				Marine m = (Marine)uArr[i];
				m.stimPack();
			} else if (uArr[i] instanceof Tank) {
				Tank m = (Tank)uArr[i];
				m.changeMode();
			} else if (uArr[i] instanceof DropShip) {
				DropShip ds = (DropShip)uArr[i];
				ds.load();
				ds.unload();
			}
		}

	}

}
