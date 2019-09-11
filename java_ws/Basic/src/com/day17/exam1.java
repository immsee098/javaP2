package com.day17;

class Account {
	private final float INTEREST_RATE = 0.1f;
	private int interest;

	
	int accountInterest(int money) {
		interest = (int)(money*INTEREST_RATE);
		return interest;
	}
}

class Circle123 {
	private int r;

	Circle123(int r){
		this.r = r;
	}

	public double findArea() {
		return  Math.PI*r*r;
	}
}//

public class exam1 {

	public static void main(String[] args) {
		Account ac = new Account();
		
		System.out.println(ac.accountInterest(10000));
		
		//(1) Circle 배열을 만들고, 요소 3개를 저장한 후, 
		Circle123[] ci = new Circle123[3];
		ci[0] = new Circle123(10);
		ci[1] = new Circle123(20);
		ci[2] = new Circle123(30);
		
		//각 요소의 면적 계산 메서드 호출하고, 면적 출력
		System.out.println(ci[0].findArea());

	}

}
