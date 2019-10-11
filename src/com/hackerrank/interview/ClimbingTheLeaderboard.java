package com.hackerrank.interview;

import java.util.*;

public class ClimbingTheLeaderboard {
	
	
	public static void main(String[] args) {
		
		
		int[] scores = {100, 100, 50, 40, 40, 20, 10};
		int[] alice =  {5, 25, 50, 120};
		
		//int[] scores = {100, 90, 90, 80, 75, 60}; 
		//int[] alice = {50, 65, 77, 90, 102}; 
				
		
		TreeSet<Integer> distinctScore = new TreeSet<Integer>();
		TreeSet<Integer> asc = new TreeSet<Integer>();
		Arrays.stream(scores).forEach(x ->  distinctScore.add(x));
		asc = (TreeSet<Integer>) distinctScore.descendingSet();
		
		
		
		
		int highest =  scores[0];
		int lowest = scores[scores.length -1];
		int rank[] = new int[alice.length];
		
		int res[] = new int[asc.size()];
		int index  =0 ;
		
		for(int i : asc) res[index++] = i;
		
		 
		 
		for(int i = 0 ;  i < alice.length; i++) {
			
			if(alice[i] > highest ) { 
				rank[i] = 1;
				highest = alice[i];
			}else if(alice[i] < lowest ) { 
				rank[i] = asc.size() +1;
				lowest = alice[i];
			}else if(asc.contains(alice[i])) {
				rank[i] = (asc.headSet(alice[i]).size() + 1);
			}else {
				
				int temp = 1;
				
				int lengthSize = res.length ;
				
				if(alice[i] > res[lengthSize / 2]) {
					temp = 1;
					for(int j = 0 ; j<= lengthSize /2   ; j++) {
						
						if(alice[i] < res[j]) {
							temp++;
						}else break;
					}
				}else {
					temp = lengthSize /2 +1;
						for(int j = lengthSize /2  ; j< lengthSize  ; j++) {
							
							if(alice[i] < res[j]) {
								
								temp++;
							}else break;
					}
					
				}
				
				
				rank[i] = temp ;
			}
		}
		Arrays.stream(rank).forEach(x -> System.out.println(x));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public static void main(String[] args) {
//		
//		
//		int[] scores = {100, 90, 90, 80, 75, 60}; 
//			//{100, 100, 50, 40, 40, 20, 10};
//		int[] alice = {50, 65, 77, 90, 102}; 
//			// {5, 25, 50, 120};
//		
//		int rank[] = new int[alice.length];
//		
//		TreeSet<Integer> distinctScore = new TreeSet<Integer>();
//		TreeSet<Integer> asc = new TreeSet<Integer>();
//		Arrays.stream(scores).forEach(x ->  distinctScore.add(x));
//		asc = (TreeSet<Integer>) distinctScore.descendingSet();
//		
//		TreeSet<Integer> ts = ranking(scores, alice);
//		
//		for(Integer i : ts) System.out.print(i+ " ");
//		
//		int highest =  scores[0];
//		int lowest = scores[scores.length -1];
//		
//		System.out.println();
//		
//		for(int i = 0 ;  i < alice.length; i++) {
//			
//			if(alice[i] > highest ) { 
//				rank[i] = 1;
//				highest = alice[i];
//			}else if(alice[i] < lowest ) { 
//				rank[i] = asc.size() +1;
//				lowest = alice[i];
//			}else if(asc.contains(alice[i])) {
//				rank[i] = (asc.headSet(alice[i]).size() + 1);
//			}else {
//				
//				rank[i] = ts.headSet(alice[i]).size() ;
//			}
//		}
//		
//		Arrays.stream(rank).forEach(x -> System.out.println(x));
//		
//	}
//
//	static TreeSet<Integer> ranking(int[] scores, int[] alice) {
//		
//		TreeSet<Integer> ts = new TreeSet<Integer>();
//		TreeSet<Integer> ts1 = new TreeSet<Integer>();
//		
//		
//		for (Integer integer : scores) {
//			ts.add(integer);
//		}
//		for (Integer integer : alice) {
//			ts.add(integer);
//		}
//		
//		ts1 = (TreeSet<Integer>) ts.descendingSet();
//
//		
//		return ts1;
//	}
}
