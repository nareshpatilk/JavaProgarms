package com.design.pattern;

public class TestSingleton {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingleton();
		System.out.println("singleton ref: "+singleton);
		Singleton singleton1 = Singleton.getSingleton();
		System.out.println("singleton ref: "+singleton1);
	}	
}
