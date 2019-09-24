package com.day24;

class Outer3{
	int value=10;
	
	class InstanceInner{
		int value=300;
		
		public void method() {
			System.out.println("value="+value);
			System.out.println("this.value="+this.value);
			System.out.println("Outer3.this.value="+Outer3.this.value);
		}
	}
}

public class InnerTest4 {

	public static void main(String[] args) {
		Outer3 outer = new Outer3();
		Outer3.InstanceInner inner = outer.new InstanceInner();
		
	}

}
