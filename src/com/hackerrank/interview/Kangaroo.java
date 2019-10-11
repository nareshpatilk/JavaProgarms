package com.hackerrank.interview;

public class Kangaroo {

	public static void main(String[] args) {
		
		
		int x1 = 21;
		int v1 = 6;
		int x2 = 47;
		int v2 = 3;
		if( x2 > x1 && v2 > v1 ) return;
		boolean temp = true;
		
		
		while(temp) {
			
			x1 = x1 + v1;
			x2 = x2 + v2;
			if(x1 == x2) {
				
				temp = false;
			}
			if(x1 > x2)
				temp = false;
			
		}
		
	}
}
