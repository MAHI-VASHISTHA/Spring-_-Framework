package com.ay.factory;

import com.ay.dependent.Flipkart;
import com.ay.target.BlueDart;
import com.ay.target.Courier;
import com.ay.target.DHL;
import com.ay.target.DTDC;

public class Factory {

	public static Flipkart getBean(String type) {

		Courier courier = null;

		if (type.equalsIgnoreCase("dtdc"))
			courier = new DTDC();

		else if (type.equalsIgnoreCase("dhl"))
			courier = new DHL();
		else if (type.equalsIgnoreCase("bluekart"))
			courier = new BlueDart();
		else
			throw new IllegalArgumentException("Invalid courier company");
		
		Flipkart  fl=new Flipkart(courier);
		return fl;
	}
}
