package com.ay.beans;

public class BudgetCar extends Car {

	public BudgetCar() {
		System.out.println("BudgetCar.BudgetCar()");
	}

	@Override
	public String drive(String regNo) {
		// TODO Auto-generated method stub
		return "BudgetCardrive() ::" + regNo;
	}


	
}
