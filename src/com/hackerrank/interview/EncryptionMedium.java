package com.hackerrank.interview;

public class EncryptionMedium {

	public static void main(String[] args) {
		
		//String s = "if man was meant to stay on the ground god would have given us roots";
		//String s = "haveaniceday";
		String s = "iffactsdontfittotheorychangethefacts";
		String space = s.replaceAll(" ", "");
		int start  = (int )Math.sqrt(space.length()); 
		
		int end = (int) Math.incrementExact(start);
		
		end = (start - Math.sqrt(space.length()) == 0 ) ?start: end; 
		System.out.println(space.length() + "Math.sqrt(space.length())" + Math.sqrt(space.length()));
		if((start * end) < s.length())
			start ++;
		
		System.out.println(" start "+ start+ " end "+ end + " (start * end) < s.length() "+( (start * end) < s.length()));
		start =6 ;end = 6;
		String result ="";
		String res[][] = new String[start][end];
		int index =0;
		for(int i = 0 ; i < start; i++) {
			if(index >= s.length()) break;
			for(int j = 0; j < end; j++) {
				if(index >= s.length()) break;
			
				res[i][j] = ""+s.charAt(index);
				
				index++;
				
			}
		}
		
		for(int i = 0 ; i < start;i ++) {
			for(int j = 0; j < end; j++) {
				System.out.print(res[i][j]);
			}System.out.println();
		}
		System.out.println("-------");
		for(int i = 0 ; i < end;i ++) {
			for(int j = 0; j < start; j++) {
				
				result += (res[j][i] != null)? res[j][i] : "";
			} result += " ";
		}
		
		System.out.print(result);
	}

}
