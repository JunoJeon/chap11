package com.example;

import java.util.Random;

class BoxInt {
		private int value;
		
		int getValue() {
			return value;
		}
		
		void setValue(int value) {
			this.value = value;
		}
	}
	
	class BoxDouble {
		private double value;
		
		double getValue() {
			return value;
		}
		
		void setValue(double value) {
			this.value = value;
		}
	}
	class BoxString {
		private String value;
		
		String getValue() {
			return value;
		}
		
		void setValue(String value) {
			this.value = value;
		}
	}
	
	class BoxRandom {
		private Random value;
		
		Random getValue() {
			return value;
		}
		
		void setValue(Random value) {
			this.value = value;
		}
	}
	
	

public class GenericExample {

	public static void main(String[] args) {
		
		BoxInt bi = new BoxInt();
		BoxDouble bd = new BoxDouble();
		BoxString bs = new BoxString();
		BoxRandom br = new BoxRandom();
		
	}

}
