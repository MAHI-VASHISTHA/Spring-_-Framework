package com.ay.beans;

import com.ay.factory.CarFactory;

public class YouthCustomer {

	public static void main(String[] args) {
		
		Car car=CarFactory.getCar("Sports");
		System.out.println(car.drive("UP 12 AS 1234"));
	}

}
