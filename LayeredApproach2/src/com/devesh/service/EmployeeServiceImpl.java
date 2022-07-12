package com.devesh.service;

import java.util.ArrayList;

import com.devesh.bean.Employee;
import com.devesh.persistence.EmployeeDaoImpl;
import com.devesh.persistence.IEmployeeDao;

public class EmployeeServiceImpl implements IEmployeeService {
	private IEmployeeDao employeeDao = new EmployeeDaoImpl();
	@Override
	public Employee searchRecordById(int empId) {
		// TODO Auto-generated method stub
		return employeeDao.searchRecordById(empId);
	}

	@Override
	public ArrayList<Employee> getAllRecords() {
		// TODO Auto-generated method stub
		return employeeDao.getAllRecords();
	}

}
