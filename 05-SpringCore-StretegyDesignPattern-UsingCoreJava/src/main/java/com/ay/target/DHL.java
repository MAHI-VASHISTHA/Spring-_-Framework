package com.ay.target;

public class DHL implements Courier {

public DHL() {
	System.out.println("DHL :: 0-param constructor");
}

@Override
public String deliver(int oid) {
	return oid+" is delivered by DHL";
}
}
