package com.hackerrank.interview;

import java.util.*;

public class LargestSubsetSum {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(2);a.add(4);
		
		List<Integer> result = new ArrayList<Integer>();;
		List<Integer> inner = null;
		for(int i : a) {
			
			inner = new  ArrayList<Integer>();
			int temp = 0;
			for(int j = 1; j<= i; j++) {
				inner.add(j);
				temp += j;
			}
			System.out.println(inner.toString());
			Collections.sort(inner);
			result.add(temp);
		}
		System.out.println(":");
		System.out.println(result.toString());
		
	}
}
