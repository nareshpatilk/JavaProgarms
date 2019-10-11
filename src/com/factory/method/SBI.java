package com.factory.method;

public class SBI implements Bank{
	private String bname;

	
	public SBI() {
		this.bname = "SBI BANK";
	}
	
	public String getBankName() {
			return bname;
	}
}
