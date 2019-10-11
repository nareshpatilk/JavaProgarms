package com.test;
import com.test.Parent;

import java.util.*;
public class TestHashMap {

	public static void main(String[] args) {
		
		HashMap map = new HashMap(); 
		Key k1 = new Key("vishal");
		Key k2 = new Key("sachin");
		Key k3 = new Key("v");
        map.put(k1, 20); 
        map.put(k2, 30); 
        map.put(k3, 40); 
  
        System.out.println(map.toString()); 
        System.out.println("Value for key sachin: " + map.get(new Key("sachin"))); 
        System.out.println("Value for key vaibhav: " + map.get(new Key("vaibhav"))); 
        
//        map.put("d1", "d1val");
//        
//        String obj = (String) map.get("d1");
//        System.out.println(obj.hashCode() + " "+ obj);
//        map.put("d1", "d1val");
//        String obj1 = (String) map.get("d1");
//        System.out.println(obj1.hashCode() + " "+ obj1);
//        System.out.println(map.toString()); 
        
	}
	
}
class Key { 
    String key; 
    Key(String key) 
    { 
        this.key = key; 
    } 
  
    @Override
    public int hashCode() 
    { 
        int hash = (int)key.charAt(0); 
        System.out.println("hashCode for key: "
                           + key + " = " + hash); 
        return hash; 
    } 
  
    @Override
    public boolean equals(Object obj) 
    { 
        return key.equals(((Key)obj).key); 
    } 
} 