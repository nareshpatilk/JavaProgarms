package com.factory.method;

public class ICICI implements Bank {
private String bname;
	
	public ICICI() {
		this.bname = "ICICI BANK";
	}
	
	public String getBankName() {
			return bname;
	}
}
