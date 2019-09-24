package com.day24;

class MyName{
	private String objName;
	
	MyName(String objName){
		this.objName = objName;
	}
	
	public void finalize() throws Throwable {
		//super.finalize(); //인스턴스가 소멸되기 직전 튀어나옴
		
		System.out.println(objName+"인스턴스가 소멸됩니다");
	}
	
	public void showInfo() {
		System.out.println("MyName 클래스의 메서드");
	}
	
}

public abstract class ObjectFinalize {

	public static void main(String[] args) {
		MyName obj1 = new MyName("인스턴스1");
		MyName obj2 = new MyName("인스턴스2");
		
		obj1.showInfo();
		obj2.showInfo();
		//이때까지는 obj들이 누군가를 가리키고 있어서 소멸대상이 아님ㅁ
		
		
		//그러나null이 되면서 소멸대상이됨
//		obj1 = null; //인스턴스1이 garbage
//		obj2 = null; //인스턴스2가 garbage
		
		obj1 = obj2; //1이 소멸대상
		obj1 = null;
		
		System.out.println("main종료");
		
		//finalize 메서드의 완뵥한 호출이 필요한 상황에서는 다음 두 메서드의 연이은 호출이 필요함
		//System.gc();
		//System.runFinalization();
		 System.gc(); //gc는 가비지 컬렉터 구동
		 System.runFinalization();

	}

}
