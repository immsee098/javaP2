package com.day24;

class Salesman{
	private long id;
	
	Salesman(long id){
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		//return this.id == ((Salesman)obj).id;
		if(obj !=null && obj instanceof Salesman) {
			return this.id == ((Salesman)obj).id; 
			} else {return false;}
	} //따로 equals 오버라이딩 해줘야함(new불러서 붙엿을땐..)
	
}

public class EqualsTest2 {

	public static void main(String[] args) {
		Salesman sm = new Salesman(1001);
		Salesman sm2 = new Salesman(1001);
		
		if (sm.equals(sm2)) {
			System.out.println("둘은 같은 사원");
		} else {
			System.out.println("둘은 다른사언");
		}
		
		if(sm==sm2) {
			System.out.println("둘은 같은 주소");
		} else {
			System.out.println("들은 다른 주소");
		}

	}

}
