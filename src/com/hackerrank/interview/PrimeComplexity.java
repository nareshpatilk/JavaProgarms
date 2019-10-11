package com.hackerrank.interview;

public class PrimeComplexity {

	public static void main(String[] args) {
		int [] a = {1 ,4,9,16,25,36,49,64,81,100,121,144,169,196,225,256,289,324,361,400,441,484,529,576,625,676,729,784,841,907};
		for(int i = 0 ; i < a.length; i ++ ) {
			
			System.out.println(a[i]+" :: "+primality(a[i]));
		}
	}
	
	static String primality(int n) {

        if(n ==0 || n == 1 ) return "Not prime";
        boolean temp = false;
    for(int i = 2 ; i < (n / 2); i++){
        if(n%i == 0){
            temp = true; break;}
    }

    return (temp) ?  "Not prime": "Prime";
    }
}
