package com.hackerrank.interview;

import java.util.*;

public class BetweenTwoSets {

	public static void main(String[] args) {
		int count = 0 ;
		//int a[] = {2,6};
		//int b[] = {24,36};
		
		//int a[] = {3,9,6};
		//int b[] = {36,72};
		
		int a[] = {1};
		int b[] = {100};
		
		TreeSet<Integer> al = new TreeSet<>();
		TreeSet<Integer> al2 = new TreeSet<>();
		List<Integer> al1 = new ArrayList();
		
		for(int i = 1 ; i <= b[0]; i++) {
			if(i % a[0] == 0) al1.add(i);
		}
		System.out.println("al1 "+ al1.toString());
		
		for(int i = 0 ; i < al1.size(); i++) {
			boolean temp = false;
			for(int j = 0 ; j < a.length; j ++) {
				System.out.println(al1.get(i) + " :: "+ a[j]+ " ::: "+  (al1.get(i) % a[j] == 0) );
				if(al1.get(i) % a[j] == 0) {
					temp = true;
				}else { temp = false; break;}
			}
			if(temp) {
				System.out.println("add ed "+ al1.get(i));
				al.add(al1.get(i));}	
			
		}
		System.out.println(al.toString());
		for(int i : al) {
			boolean temp = false;
			for(int j = 0 ; j < b.length; j++) {
				System.out.println(i+ " <> "+ b[j] + " "+ ( b[j] % i == 0));
				if(b[j] % i == 0) {
					temp = true;
				}else { temp = false; break;}
			}
			if(temp) al2.add(i);
		}
		System.out.println(al2.toString());
		System.out.println(al2.size());
		System.out.println("test");
		
	}
	
}
