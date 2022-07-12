package com.devesh.persistence;

import java.util.ArrayList;

import com.devesh.bean.Employee;

public interface IEmployeeDao {
	Employee searchRecordById(int empId);
	ArrayList<Employee> getAllRecords(); 
}
