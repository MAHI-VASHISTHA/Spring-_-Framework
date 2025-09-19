package com.ay.beans;

import com.ay.factory.CarFactory;

public class EmployeCustomer {

	public static void main(String[] args) {
		
		Car car=CarFactory.getCar("Budget");
		System.out.println(car.drive("UP 12 AS 1234"));
	}

}
