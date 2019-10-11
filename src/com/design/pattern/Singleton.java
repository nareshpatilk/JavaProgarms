package com.design.pattern;

public class Singleton {

	private static Singleton  obj;
	
	private Singleton(){System.out.println("private singleton constr");}
	
	public static Singleton getSingleton() {
		if(obj == null) {
			obj = new Singleton();
		}
		
		return obj;
	}
	
}
