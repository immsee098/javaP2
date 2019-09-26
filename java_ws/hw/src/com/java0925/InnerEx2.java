package com.java0925;

class InnerEx2 {
	class InstanceInner {}
	static class StaticInner {}

	static void staticMethod() {
		InnerEx2 ex = new InnerEx2();
		InstanceInner obj1 =ex.new InstanceInner();
		StaticInner obj2 = new StaticInner();
	}

	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
	}
}

