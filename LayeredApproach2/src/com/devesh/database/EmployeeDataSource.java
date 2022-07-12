package com.devesh.database;

import java.util.ArrayList;

import com.devesh.bean.Employee;

public class EmployeeDataSource {
	protected static ArrayList<Employee> employeeList=new ArrayList<Employee>();
	static {
		employeeList.add(new Employee(101, "Anil", "Senior Associate", "IT", 75000));
		employeeList.add(new Employee(102, "Bruansh", "Associate", "IT", 89000));
		employeeList.add(new Employee(104, "Dev", "Junior Associate", "IT", 12000));
		employeeList.add(new Employee(103, "Chitranshu", "Associate", "IT", 45000));
		employeeList.add(new Employee(105, "Esha", "Senior Associate", "IT", 56000));
		
		employeeList.add(new Employee(106, "Faiz", "Associate", "IT", 78000));
		employeeList.add(new Employee(107, "Rama", "Senior Associate", "IT", 89000));
		employeeList.add(new Employee(109, "Iti", "Associate", "IT", 90000));
		employeeList.add( new Employee(110, "Jaga", "Junior Associate", "IT", 10000));
		
		
	}
	public static ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public static void setEmployeeList(ArrayList<Employee> employeeList) {
		EmployeeDataSource.employeeList = employeeList;
	}
	
}
