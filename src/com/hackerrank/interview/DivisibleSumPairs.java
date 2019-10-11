package com.hackerrank.interview;

public class DivisibleSumPairs {

	public static void main(String[] args) {
	
		int[] ar = {1,3,2,6,1,2};
		int k =3;
		int n = ar.length;
		int res = 0;
		
		for(int i = 0 ; i < n; i++) {
			System.out.println(" ii "+ i);
			for(int j = 0 ; j < n; j++) {
				System.out.println(" got  i"+ i+ " j"+ j+ "  "+ar[i]+ "  "+ ar[j]);
				if(i == j ) break;
				if((ar[i]+ ar[j]) % k ==0) {
					++res;
				System.out.println(i+ " "+ j);
				}
				
			}
		}
		
		System.out.println(res);

	}

}
