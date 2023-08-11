package com.example;

public class GenericMethodExample {
	
	static class A {
		
	}
	
	static class B extends A {
		
	}
	static class C extends A {
		
	}
	static class D extends B {
		
	}
	public static void main(String[] args) {
		
		xxx(10);
		xxx(10.5);
		
		xxx(100);
		
//		yyy(new A());
		yyy(new B());
//		yyy(new C());
		yyy(new D());
		
		
	}
	
	static <T extends B> void yyy (T x) {	// 제한된 타입 파라메터
		
	}
	
	static <T> void xxx(T x) {
		
		System.out.println(x.getClass());
		
	}
	
	

}
