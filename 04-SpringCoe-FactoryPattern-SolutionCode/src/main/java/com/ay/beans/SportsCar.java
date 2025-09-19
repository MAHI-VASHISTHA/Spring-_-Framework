package com.ay.beans;

public class SportsCar extends Car {

	public SportsCar() {
		System.out.println("SportsCar.SportsCar()");
	}

	@Override
	public String drive(String regNo) {
		// TODO Auto-generated method stub
		return "Sports Cardrive() ::" + regNo;
	}

}
