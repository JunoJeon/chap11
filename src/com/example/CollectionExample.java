package com.example;

import java.util.ArrayList;
import java.util.Comparator;

public class CollectionExample {

	public static void main(String[] args) {
		
		int[] a1 = {1,2,3,4,5};
		
		String[] a2 = {"Hello", "Java", "sql"};
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("Hello");
		
		Comparator<Integer> c1 = new Comparator<>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		Comparator<String> c2 = new Comparator<>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	
	}

}
