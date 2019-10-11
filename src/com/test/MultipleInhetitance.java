package com.test;

class A1{
	public void made() {
		System.out.println("a1");
	}
	
	public void made2() {
		System.out.println("a1 m2");
	}
}

class A2 extends A1{
	public void made() {
		System.out.println("a2");
	}
}
public class MultipleInhetitance extends  A2 {

	public void made2() {
		System.out.println("childe m2");
	}
	
	public static void main(String[] args) {
		MultipleInhetitance m = (MultipleInhetitance) new A2();
		m.made();
		m.made2();
		
	}

	
}
