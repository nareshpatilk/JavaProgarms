package com.hackerrank.interview;

import java.util.*;
public class LongestSubarray {
	
	static List<ArrayList<Integer>> parent = new ArrayList<ArrayList<Integer>>();
	static int k = 4;
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);l.add(2);l.add(3);
		
		
		int convert[] =  new int[l.size()];
		for(int i = 0 ; i < l.size(); i++) convert[i] = l.get(i);
		
		 ArrayList<Integer> res = printSubArrays(convert, 0, 0);
		 ArrayList<Integer> result = new ArrayList<>();
		 System.out.println(parent.toString());
		 for(int i = 0 ; i < parent.size(); i++) {
			 
			 result.add(parent.get(i).size());
		 }
		 
		System.out.println(Collections.max(result));
	} 
	
	static  ArrayList<Integer> printSubArrays(int []arr, int start, int end) 
	{      
		ArrayList<Integer> l = new ArrayList<Integer>();
	    // Stop if we have reached the end of the array      
	    if (end == arr.length)  
	        return l	; 
	      
	    // Increment the end point and start from 0  
	    else if (start > end)  
	        printSubArrays(arr, 0, end + 1); 
	          
	    // Print the subarray and increment the starting point  
	    else
	    { 
	        //System.out.print("["); 
	        
	        for (int i = start; i < end; i++){ 
	           // System.out.print(arr[i]+", "); 
	            l.add(arr[i]);
	        } 

	        l.add(arr[end]);
	        //System.out.println(arr[end]+"]"); 
	       // System.out.println("all "+ l.toString());
	        
	        printSubArrays(arr, start + 1, end); 
	    } 
	   if(l.size() > 0 && l.size() != arr.length && checkSum(l, k))  parent.add( l);
	    return l; 
	} 
	
	static boolean checkSum(ArrayList arr , int k){

        int sum = 0 ;
        for(int i = 0 ; i < arr.size(); i++) {
        	sum = sum + (int) arr.get(i);
        }
        return (sum <= k) ;

    }
}
