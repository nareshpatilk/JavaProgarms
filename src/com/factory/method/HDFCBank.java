package com.factory.method;

public class HDFCBank implements Bank{

	private String bname;
	
	public HDFCBank() {
		this.bname = "HDFC BANK";
	}
	
	public String getBankName() {
			return bname;
	}
}
