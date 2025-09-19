package com.ay.factory;

import com.ay.beans.BudgetCar;
import com.ay.beans.Car;
import com.ay.beans.LuxeryCar;
import com.ay.beans.SportsCar;

public class CarFactory {

	public static Car getCar(String type) {

		Car car = null;

		if (type.equalsIgnoreCase("Sports")) {
			car = new SportsCar();
		}
		
		else if (type.equalsIgnoreCase("Luxery")) {
			car = new LuxeryCar();
		}
		else if (type.equalsIgnoreCase("Budget")) {
			car = new BudgetCar();
		}
		else 
           throw new IllegalArgumentException("Invalid car type");
		
		return car;

	}
}
