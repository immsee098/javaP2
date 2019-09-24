package com.day24;

class Outer{
	int ov;
	static int osv;
	static final int O_CONST=100;
	
	class InstanceInner{
		int iv =ov;
		int iv2 = osv;
		int n = O_CONST;
	}
	
	static class StaticInner{
		//int iv = ov; //error
		int iv = O_CONST;
		static int sv = osv;
	}
	
	public void method() {
		int local_v = 10;
		final int LOCAL_CONST = 300;
		
		class LocalInner{
			int lv = local_v;
			int lv2 = LOCAL_CONST;
			//외부 클래스의 지역변수는 final이 붙은 것만(상수) 접근가능
			//JDK8.0부터는 지역변수 접근도 ㅇㅋ
			
			int lv3=ov;
			int lv4=osv;
			int lv5=O_CONST;
			
		}
	}
}

public class InnerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
