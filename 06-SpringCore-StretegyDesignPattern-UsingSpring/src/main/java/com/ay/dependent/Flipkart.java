package com.ay.dependent;

import java.util.Arrays;
import java.util.Random;

import com.ay.target.Courier;

public class Flipkart {

	Courier courier;

	public Flipkart(Courier courier) {
		System.out.println("Flipkart :: 1-param constructor");
		this.courier = courier;
	}
	
	public String shopping (String[] items,float[] gs) {
		
		float billAmt=0.0f;
		
		for(float f:gs)
			billAmt+=f;
		
		billAmt =billAmt+(billAmt*0.18f);
		
		int oid =new Random().nextInt(1,1000000);
		
		String deliver=courier.deliver(oid);
		
		return "Your Products :"+Arrays.toString(items)+" of prices :"+Arrays.toString(gs)+" with final  billl amount of"+billAmt+" included GST and"+deliver;
		
	}
	
}
