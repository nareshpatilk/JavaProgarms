package com.test;

import  java.util.*;

public class Test {

	public static void main(String[] args) {
	
		Scanner sc1 = new Scanner(System.in);
		int Strength = sc1.nextInt();
		sc1.nextLine();
		String roll = sc1.nextLine();
		String result = "", result1 = "";
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<Integer> newal = new ArrayList<Integer>();
		ArrayList<Integer> newal1 = new ArrayList<Integer>();
		String s[] = roll.split(" ");
		
		for(int i = 0 ;i < Strength; i++) al.add(s[i]);
		
		Collections.sort(al);
		
		for(int i = 1 ; i <= Strength; i++) {
			if(i != Integer.parseInt((String)al.get(i - 1))) newal.add(i);
			
		}
		for(int i = 0 ; i < newal.size(); i++) {
			int tmp = (int) newal.get(i);
			if(!al.contains(tmp+""))
				result =  result + " "+ tmp;
		}
		result = result.trim();
		result = result.endsWith(" ")?result.substring(0, result.length() -1 ): result;
		System.out.println(result);
	}	
	
}