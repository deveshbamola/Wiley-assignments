package com.devesh.service;

import java.util.ArrayList;

import com.devesh.bean.Employee;

public interface IEmployeeService {
	Employee searchRecordById(int empId);
	ArrayList<Employee> getAllRecords(); 
}
