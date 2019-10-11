package com.hackerrank.interview;

import java.util.*;
public class BirthdayChocolate {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> s =  new ArrayList<>();
		s.add(4);
//		s.add(2);
//		s.add(1);
//		s.add(3);
//		s.add(2);
		//s.add(3);s.add(2);
		
		int res = 0;
		int d =4,m =1;
		
		for(int i = 0 ; i< s.size() ; i++) {
		
			boolean cal =false;
			int index = 0;
			int maint = i;
			int temp =0;
			while(!cal) {
				if( maint >= s.size() )break;
				System.out.println("temp "+ temp+ " : "+ s.get(maint)+ " index "+ index+ " maint" +maint);
				temp += s.get(maint);
				if(temp == d && (m == 1 || index >0)) {
					System.out.println("temp "+ temp+ " equals d "+ d);
					temp =0;
					res++;
					cal = true;
					break;
				}
				index++;
				maint++;
				if(index == m ) cal = true;
			}
			if( maint >= s.size() )break;
			System.out.println("breaks");
		}
		System.out.println(res);
		
		/*int temp = 0, j1 =0;
		System.out.println(" i "+i+" " +j1 );
		for(int j = 0; j < m ; j++) {
			System.out.println("temp "+ temp+ " : "+ s.get(i));
			temp += s.get(i);
			if(temp == d) {
				System.out.println("temp "+ temp+ " equals d "+ d);
				temp =0;
				res++;
				break;
			}
		}
		System.out.println("-------");*/
		}
}
