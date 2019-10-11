package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JavaEightEmployee {

	public static void main(String[] args) {
		
		ArrayList<EmployeeObj> al = new ArrayList<>();
		EmployeeObj obj1 = new EmployeeObj(7,"shan");
		EmployeeObj obj2 = new EmployeeObj(2,"sunil");
		EmployeeObj obj3 = new EmployeeObj(3,"sunil1");
		EmployeeObj obj4 = new EmployeeObj(5,"sunil2");
		
		Collections.sort(al, new IdComparator());
		System.out.println(al.toString());
	}
}

class IdComparator implements Comparator<EmployeeObj>{

	@Override
	public int compare(EmployeeObj arg0, EmployeeObj arg1) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getEmpId());
		if(arg0.getEmpId() > arg1.getEmpId())
			return arg1.getEmpId();
		else 
			return arg0.getEmpId();
	}
	
	
}