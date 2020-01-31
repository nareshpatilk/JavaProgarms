package com.hackerrank.interview;

import java.util.*;
public class AreaOfTriangle {

	public static void main(String[] args) {
		
		List<Integer> x = new ArrayList<Integer>();
		x.add(0);x.add(3);x.add(6);
		
		List<Integer> y = new ArrayList<Integer>();
		y.add(0);y.add(3);y.add(0);	
		
		List<ArrayList<Integer>> co = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0 ; i < x.size(); i++) {
			ArrayList<Integer> inner = new ArrayList<Integer>();
			inner.add(x.get(i));
			inner.add(y.get(i));
			co.add(inner);
			
		}

		
	}
}
