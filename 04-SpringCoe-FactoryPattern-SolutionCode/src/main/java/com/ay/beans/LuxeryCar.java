package com.ay.beans;

public class LuxeryCar extends Car {

	public LuxeryCar() {
		System.out.println("LuxeryCar.LuxeryCar()");
	}

	@Override
	public String drive(String regNo) {
		// TODO Auto-generated method stub
		return "LuxeryCardrive() ::" + regNo;
	}

}


