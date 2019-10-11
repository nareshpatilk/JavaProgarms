package com.test;

import java.util.*;
public class TwoDArr {

	public static void main(String[] args) {
		
		int[][] arr = {{0, -4, -6, 0, -7, -6},
					   {-1, -2, -6, -8, -3, -1},
					   {-8, -4, -2, -8, -8, -6},
					   {-3, -1, -2, -5, -7, -4},
					   {-3, -5, -3, -6, -6, -6},
					   {-3, -6, 0, -8, -6, -7},
					   };
		int totalSum = 0;
		ArrayList<Integer> al = new ArrayList<>();
		for(int row = 0 ; row < arr.length ; row++) {
			int sum = 0;
			if(row == 4 || row == 5) break;
			for(int col = 0; col< arr[row].length; col++) {
				if(col == 4 || col == 5) break;
				System.out.println(row + "col " + col);
				sum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2] +
					  arr[row + 1][col + 1]	+
					  arr[row + 2][col] + arr[row +2][col + 1] + arr[row +2 ][col + 2];
				//totalSum = (totalSum < sum)? sum: totalSum;
				al.add(sum);
			}
			
		}
		Collections.sort(al);
		System.out.println(al.toString());
	}
}
