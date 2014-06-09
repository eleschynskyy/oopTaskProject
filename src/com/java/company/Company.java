package com.java.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.java.employee.Employee;

public class Company implements Organization {

	private String name;
	private List<Employee> staff;

	public Company() {
		this.staff = new ArrayList<Employee>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getStaff() {
		return staff;
	}

	public void getReport() {
		System.out.println("Full company report");
		System.out.println("--------------------------------------------");
		System.out.println("COMPANY NAME: " + getName());
		System.out.println("EMPLOYEES:");
		getEmployeesReport();
	}

	private void getEmployeesReport() {
		Iterator<Employee> it = staff.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println("\tNAME: " + emp.getName());
			System.out.println("\tSALARY: " + emp.getSalary());
			System.out.println("\tPOSITION: " + emp.getClass().getSimpleName());
			System.out.println("\tRESPONSIBILITIES: " + emp.requestWhatEmployeeDoes());
			System.out.println();
		}
	}

	@Override
	public void hireEmployee(Employee emp) {
		staff.add(emp);
	}

	@Override
	public void fireEmployee(Employee emp) {
		staff.remove(getEmployeeIndex(emp));
	}

	private int getEmployeeIndex(Employee emp) {
		int size = staff.size();
		int index = 0;
		for (int i = 0; i <= size; i++){
			Employee current = staff.get(i);
			if (current.getName().equals(emp.getName())){
				index = i;
				break;
			}
		}
		return index;
	}

}
