package com.test;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {2,6,8,2,4,7,1,2,8};
		
		for(int i = 0 ; i < arr.length; i++) {
			for(int j =0 ; j < arr.length; j++) {
				
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i : arr) System.out.print(i+ " ");
	}
}
