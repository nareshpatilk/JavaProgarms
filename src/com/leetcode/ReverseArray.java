package com.leetcode;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6,7};
		int k =0;
		
		
		int result[] = new int[nums.length];
        int index =0 ;
        for(int i = nums.length - 1 ; i > k; i --){
            result[index] = nums[i];
            index++;
        }
        for(int i = 0 ; i < nums.length - k; i++){
        	result[index] = nums[i];
        	index++;
        }
        for(int i : result)
        	System.out.print(i);
	}
}
