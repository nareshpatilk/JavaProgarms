package com.hackerrank.interview;

import java.util.Arrays;

class SinglyLinkedListNode1 {
    int data;
    SinglyLinkedListNode1 next;
}

public class InsertNodeHeadLinked {

	 
      
     
     
     public static void main(String[] args) {
		
    	 int[]  arr = new int[]{383,484,392,975,321};
    	 SinglyLinkedListNode1 prev =null;
    	 for(int i = 0 ; i < arr.length; i++) {
    		 SinglyLinkedListNode1 newRef = new SinglyLinkedListNode1();
    		 
    		 newRef.data = arr[i];
    		 newRef.next = null;
    		 if(prev != null) 
    			 prev = newRef;
    	 }
    	 
    	 while(prev!=null) {
    		 System.out.println(prev.data);
    	 }
    	 
     }
}
