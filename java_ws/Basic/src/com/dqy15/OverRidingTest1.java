package com.dqy15;

class Points{
	protected int x, y;
	public String findLocation() {
		
		return "x="+x+"y="+y;
	}
	
}

class Points3D extends Points{
	private int z;
	
	//�������̵� �޼���
	public String findLocation() {
		
		return "x="+x+"y="+y+"z"+z;
	}
	//*�������̵� �޼���
	//-�θ�κ��� ��ӹ��� �޼����� ������ �ڽ� Ŭ������ �°� �����ϴ� ��
}

public class OverRidingTest1 {

	public static void main(String[] args) {
		Points3D p3 = new Points3D();
		String locate =p3.findLocation();
		System.out.println("2���� ���� ��ǥ:"+locate);
		
		Points p = new Points();
		String locate2 =p.findLocation();
		System.out.println("3���� ���� ��ǥ:"+locate2);

	}

}
