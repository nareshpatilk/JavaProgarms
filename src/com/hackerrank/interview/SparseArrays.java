package com.hackerrank.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SparseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = {"abcde","sdaklfj","asdjf","na","basdn","sdaklfj","asdjf","na","asdjf","na","basdn","sdaklfj","asdjf"};
		String queries[]  = {"abcde","sdaklfj","asdjf","na","basdn"};
		int[] result = new int[queries.length];
		LinkedList<Integer> linked = new LinkedList<Integer>();
		linked.add(14);
		linked.add(15);
		linked.add(16);
		int index = 0;
		
		for(String qur : queries) {
			//List<String> resultList = Arrays.stream(strings).filter(x -> x.equalsIgnoreCase(qur)).collect(Collectors.toList()).size();
			result[index++] =Arrays.stream(strings).filter(x -> x.equalsIgnoreCase(qur)).collect(Collectors.toList()).size();
		}
		Arrays.stream(result).forEach(x -> System.out.println(x));
		linked.stream().forEach(x -> System.out.println("linked list"+ x));
		
		
		
	}

}
