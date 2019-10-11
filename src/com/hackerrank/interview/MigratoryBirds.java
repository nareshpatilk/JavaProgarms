package com.hackerrank.interview;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MigratoryBirds {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		
//		al.add(1);al.add(2);al.add(3);al.add(4);al.add(5);
//		al.add(4);al.add(3);al.add(2);al.add(1);al.add(3);
//		al.add(4);al.add(4);
		al.add(2);al.add(4);al.add(3);al.add(2);al.add(3);al.add(1);
		al.add(2);al.add(1);al.add(3);al.add(3);
		//2 4 3 2 3 1 2 1 3 3
		Collections.sort(al);
		int count = 0;
		int res = 0;
		
		//Set<Integer> ts =  al.stream().collect(Collectors.toSet()); 
		TreeSet<Integer> ts =  new TreeSet<>(al); 
		ArrayList<Integer> newAl = new ArrayList<>(ts);
		
		for(int i = 0 ; i < newAl.size(); i++) {
			int tempcount = 1, tempVal = 0;;
			for(int j = 0; j < al.size(); j++) {
				if(al.get(j) > newAl.get(i)) break;
				if(i ==j ) continue;
				System.out.println("al.get(i) "+ newAl.get(i)+ " al.get(j) "+ al.get(j) + " (al.get(i) == al.get(j)) "+ (newAl.get(i) == al.get(j)));
				if(newAl.get(i) == al.get(j)) {
					
					++tempcount; 
					tempVal = newAl.get(i);
				}
			}
			
			System.out.println("---------- tempcount" +tempcount+  " tempVal "+ tempVal);
			if(tempcount > count  ) {
				count =  tempcount;
				if(res < tempVal    )res = tempVal;
			}
			System.out.println("---------- count" +count+  " res "+ res);
		}
		
		System.out.println(res);
	}

}
