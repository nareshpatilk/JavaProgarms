package com.hackerrank.interview;

import java.util.Arrays;

public class Seegrate01 {

	public static void main(String[] args) {
		
		
		int [] ar = {0,1,0,1,1,0,0,0,0,1,1,0};
		int res[] = new int[ar.length];
		
		int var0 = 0 , var1 = 1;
		int index1 = ar.length -1;
		int index0 = 0;
		for(int i = 0 ; i < ar.length; i++) {
			
			if(ar[i] == var0) {
				res[index0++] = ar[i];
			}
			if(ar[i] == var1) {
				res[index1--] = ar[i];
			}
		}
		
		Arrays.stream(res).forEach(data -> System.out.print(data+" "));
	}
	
}
