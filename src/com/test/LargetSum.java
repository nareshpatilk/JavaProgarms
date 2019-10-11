package com.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class LargetSum {

	public static void main(String[] args) {
		
		
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		int tmp = 0, max=0, min =0;
		for(int i : arr) {
			min += i;
			System.out.println(min+ " ");
			if(min < 0) min = 0;
			if(max < min) max = min;
			System.out.println(min+ "still and max :"+max);
		}
		
		System.out.println();
		System.out.println(max);
	}
}
