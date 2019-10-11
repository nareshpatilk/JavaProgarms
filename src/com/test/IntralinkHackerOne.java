package com.test;

import java.util.*;

public class IntralinkHackerOne {

	public static void main(String[] args) {
		
		List<String> products = new ArrayList<>();
		products.add("rice");
		products.add("sugar");
		products.add("wheat");
		products.add("cheese");
		
		List<Float> productPrices = new ArrayList<>();
		productPrices.add((float) 16.89);
		productPrices.add((float) 56.92);
		productPrices.add((float) 20.89);
		productPrices.add((float) 345.99);
		
		List<String> productSold = new ArrayList<>();
		productSold.add("rice");
		productSold.add("cheese");
		
		List<Float> soldPrice = new ArrayList<>();
		soldPrice.add((float) 16.89);
		soldPrice.add((float) 400.89);
		
		HashMap<String, Float> items = new HashMap<>();
		for(int i =0 ; i < products.size(); i++)
			items.put(products.get(i), productPrices.get(i));
		
		HashMap<String, Float> itemsold = new HashMap<>();
		for(int i =0 ; i < productSold.size(); i++)
			itemsold.put(productSold.get(i), soldPrice.get(i));
		
		int count = 0;
		for(int i = 0 ; i< productSold.size();i ++) {
			float originalVal = items.get(productSold.get(i));
			float soldVal = itemsold.get(productSold.get(i));
			if(originalVal != soldVal) count++;
			
		}
		
	}
	
}
