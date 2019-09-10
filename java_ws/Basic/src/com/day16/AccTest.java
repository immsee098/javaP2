package com.day16;

class Account{
	protected String accNum;
	protected int left;
	
	Account(String accNum, int left){
		this.accNum = accNum;
		this.left =left;
	}
	
	void display() {
		System.out.println(accNum);
		System.out.println(left);
	}
	
}


class KBAccount extends Account{
	private int amount;
	KBAccount(String accNum, int left, int amount){
		super(accNum, left);
		
	}
}

public class AccTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
