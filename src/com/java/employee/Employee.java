package com.java.employee;

public abstract class Employee {
	
	private static final String EMPLOYEE_TYPES = "DEV, TESTERS";

	protected String name;
	protected int salary;
	
	public static void getEmployeeTypes(){
		System.out.println("Supported types are: " + EMPLOYEE_TYPES);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public abstract String requestWhatEmployeeDoes();
	
	protected final void getType(){
		System.out.println("TEST");
	}

}
