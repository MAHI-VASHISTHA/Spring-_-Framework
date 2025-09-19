package com.ay.target;

public class DTDC implements Courier {

	public DTDC() {
		System.out.println("DTDC :: 0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		return oid+" is delivered by DTDC";
	}

}
