package com.example;

import java.util.ArrayList;
import java.util.Random;

public class WildCardExample {
	
	static class A {
		
	}
	static class B extends A {
		
	}
	static class C extends A {
		
	}
	static class D extends B {
		
	}
	static class E extends D {
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<?> list1 = new ArrayList<Integer>();
		list1 = new ArrayList<A>();
		list1 = new ArrayList<String>();
		
		ArrayList<? extends A> list2 = null;	// A를 포함한 A의 자식 손주까지 가능
		
		list2 = new ArrayList<A>();
		list2 = new ArrayList<B>();
		list2 = new ArrayList<D>();
		list2 = new ArrayList<E>();
		
		ArrayList<? super E> list3 = null;		// E를 포함한 E의 부모 조상까지 가능
		
		list3 = new ArrayList<E>();
		list3 = new ArrayList<B>();
		list3 = new ArrayList<A>();
		list3 = new ArrayList<D>();
//		list3 = new ArrayList<C>();

	}

	public static void main2(String[] args) {
		
		ArrayList<Integer> list1 = null;
		
		list1 = new ArrayList<Integer>();
//		list1 = new ArrayList<Double>();
		
		ArrayList<?> list2 = null;
		list2 = new ArrayList<Integer>();
		list2 = new ArrayList<Double>();
		list2 = new ArrayList<String>();
		list2 = new ArrayList<Random>();
		
		int[] arr1 = null;
		double[] arr2 = null;
		
		arr1 = new int[] {1,2,3,4};
//		arr1 = new double[] {1,2,3,4}; (X)
		
//		arr1 = arr2;  (X)		
		
	}

}
