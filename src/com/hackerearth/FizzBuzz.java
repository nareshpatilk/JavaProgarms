package com.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FizzBuzz {

	public static void main(String[] args) throws IOException {
		
//		Scanner sc1 = new Scanner(System.in);
//		int noOfTestCase = sc1.nextInt();
//		sc1.nextLine();
//		String arr = sc1.nextLine();
//		String[] arr1 = arr.trim().split(" "); 
//		int[] actu = new int[arr1.length];
//		for(int i = 0 ; i < arr1.length; i++) actu[i] = Integer.parseInt(arr1[i]);
//		
//		Arrays.stream(actu).forEach(x -> System.out.println(x));
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String T = br.readLine();    
         
         int arr[] = new int[Integer.parseInt(T)];
         String N1[] = br.readLine().trim().split(" ");
         int[] actu = new int[Integer.parseInt(T)];
         for(int i = 0 ; i < N1.length; i++) actu[i] = Integer.parseInt(N1[i]);
         
         for(int i = 0; i < actu.length;i ++) {
        	 
        	 for(int j = 1; j <= actu[i]; j++) {
        		 
        		 if(j % 3 ==0 && j % 5 ==0)
        			 System.out.println("FizzBuzz");
        		 else if (j % 3 == 0)
        			 System.out.println("Fizz");
        		 else if (j % 5 == 0)
        		 	System.out.println("Buzz");
        		 else
        			 System.out.println(j);
        	 }
         }
         
	}
}
