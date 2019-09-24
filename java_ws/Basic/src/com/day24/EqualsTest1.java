package com.day24;

class Test{
	private int value;
	Test(int value){
		this.value = value;
	}
}

public class EqualsTest1 {

	public static void main(String[] args) {
		Test t = new Test(10);
		Test t2 = new Test(10);
		
		if(t==t2) {
			System.out.println("t客 t2狼 林家绰 鞍促");
		} else {
			System.out.println("t客 t2狼 林家绰 促福促");
		}
		
		
		if(t.equals(t2)) {
			System.out.println("t客 t2绰 悼老林家");
		} else {
			System.out.println("t客 t2绰 促弗 林家");
		}
		
		t=t2;
		if(t.equals(t2)) {
			System.out.println("t客 t2绰 悼老 林家捞促");
		}
	}

}
