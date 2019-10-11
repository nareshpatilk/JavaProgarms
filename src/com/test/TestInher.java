package com.test;

public class TestInher extends Parent{

	public TestInher() {
		System.out.println("I am TestIn cnstr");
	}
	
	public void publicMethod(){
		System.out.println(" child public void publicMethod");
	}
	public void publicMethod(String s) {
		System.out.println(" child public void publicMethod with s");
	}
	
	private void privateMethod() {
		System.out.println(" child private void privateMethod ");
	}
	
	private void privateMethod(String s) {
		System.out.println(" child private void privateMethod with s");
	}
	
	static void staticMethod() {
		System.out.println(" child static void staticMethod ");
	}
	
	static void staticMethod(String s) {
		System.out.println(" child static void staticMethod with s");
	}
	
	public static void main(String[] args) {
		TestInher child = new TestInher();
		child.privateMethod();
		TestInher.staticMethod();
		System.out.println("i am running");
	}
	
}
class Parent {
	public void publicMethod() {
		System.out.println(" public void publicMethod ");
		//return "child public";
	}
	
	public void publicMethod(String s) {
		System.out.println(" public void publicMethod with s");
	}
	
	private void privateMethod() {
		System.out.println(" private void privateMethod ");
	}
	private void privateMethod(String s) {
		System.out.println(" private void privateMethod with s");
	}
	static void staticMethod() {
		System.out.println(" static void staticMethod ");
	}
	
	static void staticMethod(String s) {
		System.out.println(" static void staticMethod with s");
	}
}