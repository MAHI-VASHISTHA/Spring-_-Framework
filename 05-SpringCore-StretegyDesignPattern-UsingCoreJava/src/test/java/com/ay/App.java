package com.ay;

import com.ay.dependent.Flipkart;
import com.ay.factory.Factory;

public class App {

	public static void main(String[] args) {

		Flipkart ft = Factory.getBean("DHL");
		String msg = ft.shopping(new String[] { "shirt", "t-shirt", "shoes", "jeans" },
		new float[] { 1200f, 999f, 4999f, 1599f });
	
		System.out.println(msg);
	}
}
