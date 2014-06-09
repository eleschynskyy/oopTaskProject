package com.java.people;

import com.java.employee.Employee;

public class Dev extends Employee {

	@Override
	public String requestWhatEmployeeDoes() {
		return "writing the code";
	}
	
//	public void getType(){
//		System.out.println("trying to override final method from parent class...");
//	}

}
