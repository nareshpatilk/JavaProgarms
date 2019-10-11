package com.hackerrank.interview;

import java.util.*;
public class BreakingTheRecords {

	public static void main(String[] args) {
		
		//int score[] = {10, 5, 20, 20, 4, 5, 2,25, 1};
		int score[] = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
		TreeSet<Integer> highest = new TreeSet<Integer>();
		TreeSet<Integer> lowest = new TreeSet<Integer>();
		
		int result[] = new int[2];
		
		int high = score[0], low = score[0];
		
		for(int i = 0 ; i < score.length; i++) {
			if(score[i] != high && score[i] > high) {
				highest.add(score[i]);
				high = score[i];
			}
			if(score[i] != low && score[i] < low) {
				lowest.add(score[i]);
				low = score[i];
			}
			
		}
		result[0] = highest.size();
		result[1] = lowest.size();
		System.out.println(highest.toString());
		System.out.println(lowest.toString());
		
		
	}
}
