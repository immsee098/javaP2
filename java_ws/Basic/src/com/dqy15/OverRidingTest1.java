package com.dqy15;

class Points{
	protected int x, y;
	public String findLocation() {
		
		return "x="+x+"y="+y;
	}
	
}

class Points3D extends Points{
	private int z;
	
	//오버라이딩 메서드
	public String findLocation() {
		
		return "x="+x+"y="+y+"z"+z;
	}
	//*오버라이딩 메서드
	//-부모로부터 상속받은 메서드의 내용을 자식 클래스에 맞게 변경하는 것
}

public class OverRidingTest1 {

	public static void main(String[] args) {
		Points3D p3 = new Points3D();
		String locate =p3.findLocation();
		System.out.println("2차원 점의 좌표:"+locate);
		
		Points p = new Points();
		String locate2 =p.findLocation();
		System.out.println("3차원 점의 좌표:"+locate2);

	}

}
