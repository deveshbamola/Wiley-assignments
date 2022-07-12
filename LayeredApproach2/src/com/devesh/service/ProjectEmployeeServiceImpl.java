package com.devesh.service;

import java.util.HashSet;

import com.devesh.bean.Employee;
import com.devesh.bean.Project;
import com.devesh.persistence.IProjectEmployee;
import com.devesh.persistence.ProjectEmployeesDaoImpl;

public class ProjectEmployeeServiceImpl implements IProjectEmployeeService {
	IProjectEmployee pedao = new ProjectEmployeesDaoImpl();

	@Override
	public boolean allocate(Employee emp, Project pro) {
		return pedao.allocate(emp, pro);
	}

	@Override
	public boolean dellocate(Employee emp, Project pro) {
		return pedao.dellocate(emp, pro);
	}

	@Override
	public HashSet<Employee> getEmployeesByProjectID(Project pro) {
		return pedao.getEmployeesByProjectID(pro);
	}

}
