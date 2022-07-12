package com.devesh.persistence;

import java.util.ArrayList;
import java.util.List;

import com.devesh.bean.Employee;
import com.devesh.database.EmployeeDataSource;

public class EmployeeDaoImpl implements IEmployeeDao{

	@Override
	public Employee searchRecordById(int empId) {
		List<Employee> employees=EmployeeDataSource.getEmployeeList();
		for(Employee e:employees) {
			if(e.getEmpId()==empId)
				return e;
		}
		return null;
	}

	@Override
	public ArrayList<Employee> getAllRecords() {
		// TODO Auto-generated method stub
		return EmployeeDataSource.getEmployeeList();
	}

}
