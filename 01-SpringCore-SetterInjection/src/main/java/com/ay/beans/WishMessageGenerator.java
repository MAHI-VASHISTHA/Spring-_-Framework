package com.ay.beans;

import java.util.*;

public class WishMessageGenerator {

	private Date date;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator 0-para construtor");
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String generateMessage(String user) {
		
		int hours=date.getHours();
		
		if(hours<12) 
			return "Good Morning " +user;

			else if(hours<16) 
				return "Good AfterNoon "+user;
			
			
			else if(hours<20)
				return"Good Evening "+user;
			else
				return"Good Night "+user;
			
			
		
	}
}
 