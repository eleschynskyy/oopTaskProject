package com.java.main;

import com.java.company.Company;
import com.java.employee.Employee;
import com.java.people.Dev;
import com.java.people.Tester;

public class TestITCompany {

	public static void main(String[] args) {
		Company company = new Company();
		company.setName("B&B");
		//impossible to create instance of abstract class
//		Employee sam = new Employee();
		//but possible to call static method
		Employee.getEmployeeTypes();
		Employee bob = new Dev();
		bob.setName("Bob");
		bob.setSalary(1000);
		Employee jack = new Tester();
		jack.setName("Jack");
		jack.setSalary(500);
		company.hireEmployee(bob);
		company.hireEmployee(jack);
		company.getReport();
		company.fireEmployee(jack);
		company.getReport();
	}

}
