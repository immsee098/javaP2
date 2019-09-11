package com.day17;

class Car {
	public void drive() {
		System.out.println("운전");
	}
	
	public void stop() {
		System.out.println("자를 멈춘다");
	}
}


class FireEngine extends Car {
	public void drive() {
		System.out.println("소방차를 운전합니다");
	}
	
	public void water() {
		System.out.println("water!!");
	}
}

class Ambulance extends Car {
	public void drive() {
		System.out.println("앰뷸런스를 운전합니다");
	}
	
	public void siren() {
		System.out.println("siren~!!");
	}
}


public class DownCasting {

	public static void main(String[] args) {
		/*
		 참조변수의 형변환 - 참조변수도 상속관계에 있는 변수들끼리는 형변환이 가능함
		 
		 [1] 자동형변환(업캐스팅-upcasting, 다형성의 경우)
		 	부모 참조변수 = 자식
		 	=>자식 타입의 참조변수를 부모 타입으로 형변환
		 	예) Parent p = new Child();
		 
		 [2] 명시적형변환(다운캐스팅-downcasting, 자식만의 메서드 호출 가능)
		 	자식 참조변수 = 부모 참조변수
		 	=> 부모 타입의 참조변수를 자식타입으로 형변환
		 	예) Child ch = (Child)p;
		 		Child ch = (Child)new Parent(); //예외발생
		 */
		
		Car c = new FireEngine();
		c.drive(); //자식의 오버라이딩 메서드 호출
		//c.water(); //error
		
		Car c2 = new Ambulance();
		c2.drive();
		//c2.siren(); //error, 자식의 메서드 호출 불가
		
		//명시적 형변환 - downcasting
		FireEngine f = (FireEngine)c;
		f.water(); //자식만의 메서드 호출 가능해짐
		
		Ambulance am = (Ambulance)c2;
		am.siren();
		
		//주의
		//FireEngine f2 =(FireEngine)new Car(); //컴파일은되나 실행오류남
		//f2.drive();
		
		/*
		 참조변수 instanceof 클래스(타입)
		 => 참조변수가 클래스의 인스턴스이면 true, 아니면 false
		 => 자식만의 메서드 호출 가능해짐
		 \
		 참조변수의 실제 인스턴스를 알아보기 위해 사용
		 */
		System.out.println("c가 FireEngine의 인스턴스인가?"+(c instanceof FireEngine));
		System.out.println("c2가 Ambulance의 인스턴스인가?"+(c2 instanceof Ambulance));
		
		if(c instanceof FireEngine) {
			FireEngine f3 = (FireEngine)c;
			f3.water();
		} else {
			System.out.println("FireEngine으로 혈변환 불가");
		}
		
		if(c2 instanceof FireEngine) {
			FireEngine f3 = (FireEngine)c2;
			f3.water();
		} else if(c2 instanceof Ambulance) {
			Ambulance am3 = (Ambulance)c2;
			am3.siren();
		} else {
			System.out.println("Ambulance로 형변환 불가");
		}
		
		/*
		 자식 instanceof 부모
		 => true
		 => 자식은 부모의 인스턴스이기도 하므로
		 
		 //부모의 참조변수는 본디 부모만 접근 가능함
		 */
		
		FireEngine f4 = new FireEngine();
		if(f4 instanceof FireEngine) {
			System.out.println("f4는 FireEngine의 인스턴스이다");
		}
		if(f4 instanceof Car) {
			System.out.println("f4는 Car의 인스턴스이다");
		}
		if(f4 instanceof Object) {
			System.out.println("f4는 Object의 인스턴스이다");
		}
	}

}
