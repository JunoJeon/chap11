package com.example;

import java.util.Random;


class Box<T> {					// Generic 클래스
	
	T value;
	
	T getValue() {
		return value;
	}
	
	void setValue(T value) {
		this.value = value;
	}
	
}


public class GenericExample2 {

	public static void main(String[] args) {
		
		Box<Byte> 			b1 = new Box<>();
		Box<Short> 		b2 = new Box<>();
 		Box<Integer> 		b3 = new Box<>();
		Box<Character>	b4 = new Box<>();
		Box<Long> 			b5 = new Box<>();
		
		Box<Float> 		b6 = new Box<>();
		Box<Double> 		b7 = new Box<>();
		
		Box<Boolean> 		b8 = new Box<>();
		
		Box<String> 		b9 = new Box<>();
		Box<Random> 		b10 = new Box<>();
		
		
		
		
	}

}
